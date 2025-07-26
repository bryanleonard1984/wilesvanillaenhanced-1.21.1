package net.bryanleonard1984.vanenhanced.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.context.CommandContext;
import net.bryanleonard1984.vanenhanced.util.CopperPoints;
import net.bryanleonard1984.vanenhanced.util.IEntityDataSaver;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.command.argument.EntityArgumentType;
import net.minecraft.command.argument.ItemStackArgument;
import net.minecraft.command.argument.ItemStackArgumentType;
import net.minecraft.item.Item;
import net.minecraft.nbt.NbtElement;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;

public class ItemCopperPointsValueCommand
{
    public static void register(CommandDispatcher<ServerCommandSource> serverCommandSourceCommandDispatcher,
                                CommandRegistryAccess commandRegistryAccess,
                                CommandManager.RegistrationEnvironment registrationEnvironment)
    {
        serverCommandSourceCommandDispatcher.register(
                CommandManager.literal("copperPoints")
                        .then(CommandManager.literal("check")
                                .then(CommandManager.argument("item", ItemStackArgumentType.itemStack(commandRegistryAccess)).executes(ItemCopperPointsValueCommand::runItemCheck))
                                .then(CommandManager.argument("targets", EntityArgumentType.player()).executes(ItemCopperPointsValueCommand::runPlayerCheck)))
                        .requires(source -> source.hasPermissionLevel(2))
                        .then(CommandManager.literal("add")
                                .then(CommandManager.argument("targets", EntityArgumentType.player()).executes(context ->
                                        (
                                                addCopperPoints(context, 1)
                                        )
                                )
                                        .then(CommandManager.argument("count", IntegerArgumentType.integer(1)).executes(context -> addCopperPoints(
                                                                context, IntegerArgumentType.getInteger(context, "count")
                                                        )
                                                )
                                        )
                                )
                )
        );
    }

    private static int runItemCheck(CommandContext<ServerCommandSource> context)
    {
        ItemStackArgument stackArgument = ItemStackArgumentType.getItemStackArgument(context, "item");
        Item item = stackArgument.getItem();
        CopperPoints copperPointsItem = (CopperPoints) item;

        int points = copperPointsItem.getCopperPoints();
        context.getSource().sendFeedback(() -> Text.literal("Copper Points: " + points), false);

        return 1;
    }

    private static int runPlayerCheck(CommandContext<ServerCommandSource> context)
    {
        IEntityDataSaver player = (IEntityDataSaver) context.getSource().getPlayer();
        assert player != null;
        if(player.getPersistentData().contains("copperPoints", NbtElement.INT_TYPE))
        {
            int points = player.getPersistentData().getInt("copperPoints");
            context.getSource().sendFeedback(() -> Text.literal("You have " + points + " Copper Points."), false);
        } else {
            player.getPersistentData().putInt("copperPoints", 0);
            context.getSource().sendFeedback(() -> Text.literal("You have 0 Copper Points."), false);
        }

        return 1;
    }

    private static int addCopperPoints(CommandContext<ServerCommandSource> context, int count)
    {
        IEntityDataSaver player = (IEntityDataSaver) context.getSource().getPlayer();
        assert player != null;
        if(player.getPersistentData().contains("copperPoints", NbtElement.INT_TYPE))
        {
            int points = player.getPersistentData().getInt("copperPoints") + count;
            player.getPersistentData().putInt("copperPoints", points);
            context.getSource().sendFeedback(() -> Text.literal("You have added " + count + " Copper Points for a total of " + points + " Copper Points."), false);
        } else {
            player.getPersistentData().putInt("copperPoints", count);
            context.getSource().sendFeedback(() -> Text.literal("You have added " + count + " Copper Points."), false);
        }

        return 1;
    }
}
