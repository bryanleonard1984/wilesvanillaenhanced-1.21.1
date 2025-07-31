package net.bryanleonard1984.vanenhanced.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.bryanleonard1984.vanenhanced.util.CopperPoints;
import net.bryanleonard1984.vanenhanced.util.IEntityDataSaver;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.command.argument.EntityArgumentType;
import net.minecraft.command.argument.ItemStackArgument;
import net.minecraft.command.argument.ItemStackArgumentType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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
                        .then(CommandManager.literal("items")
                                .then(CommandManager.argument("item", ItemStackArgumentType.itemStack(commandRegistryAccess))
                                        .executes(context -> runItemCheck(
                                                context.getSource(),
                                                ItemStackArgumentType.getItemStackArgument(context, "item")
                                                )
                                        )
                                )
                        )
                        .then(CommandManager.literal("players")
                                .then(CommandManager.literal("check")
                                        .then(CommandManager.argument("targets", EntityArgumentType.player())
                                                .executes(context -> runPlayerCheck(
                                                        context.getSource(),
                                                        EntityArgumentType.getPlayer(context, "targets")))))
                                .then(CommandManager.literal("add")
                                        .then(CommandManager.argument("targets", EntityArgumentType.player())
                                                .executes(context -> addCopperPoints(
                                                        context.getSource(),
                                                        EntityArgumentType.getPlayer(context, "targets"),
                                                        1
                                                ))
                                                .then(CommandManager.argument("amount", IntegerArgumentType.integer(1))
                                                        .executes(context -> addCopperPoints(
                                                                context.getSource(),
                                                                EntityArgumentType.getPlayer(context, "targets"),
                                                                IntegerArgumentType.getInteger(context, "amount")
                                                        )))))
                                .then(CommandManager.literal("subtract")
                                        .then(CommandManager.argument("targets", EntityArgumentType.player())
                                                .executes(context -> subtractCopperPoints(
                                                        context.getSource(),
                                                        EntityArgumentType.getPlayer(context, "targets"),
                                                        1
                                                ))
                                                .then(CommandManager.argument("amount", IntegerArgumentType.integer(1))
                                                        .executes(context -> subtractCopperPoints(
                                                                context.getSource(),
                                                                EntityArgumentType.getPlayer(context, "targets"),
                                                                IntegerArgumentType.getInteger(context, "amount")
                                                        )))))
                                .then(CommandManager.literal("clear")
                                        .then(CommandManager.argument("targets", EntityArgumentType.player())
                                                .executes(context -> clearCopperPoints(
                                                        context.getSource(),
                                                        EntityArgumentType.getPlayer(context, "targets")
                                                ))))
                        )
        );
    }

    private static int runItemCheck(ServerCommandSource source, ItemStackArgument itemStackArgument) throws CommandSyntaxException
    {
        ItemStack itemStack = itemStackArgument.createStack(1, false);
        Text name = itemStack.toHoverableText();
        Item item = itemStack.getItem();
        int points = ((CopperPoints) item).getCopperPoints();

        source.sendFeedback(() -> Text.translatable("commands.copperPointsItem.success", name, points), false);

        return 1;
    }

    private static int runPlayerCheck(ServerCommandSource source, PlayerEntity player)
    {
        IEntityDataSaver playerData = (IEntityDataSaver) player;
        assert playerData != null;
        Text name = player.getName();

        if(playerData.getPersistentData().contains("copperPoints", NbtElement.INT_TYPE))
        {
            int points = playerData.getPersistentData().getInt("copperPoints");
            source.sendFeedback(() -> Text.translatable("commands.copperPointsPlayerCheck.success", name, points), false);
        } else {
            playerData.getPersistentData().putInt("copperPoints", 0);
            source.sendFeedback(() -> Text.translatable("commands.copperPointsPlayerCheck.success", name, 0), false);
        }

        return 1;
    }

    private static int addCopperPoints(ServerCommandSource source, PlayerEntity player, int count)
    {
        IEntityDataSaver playerData = (IEntityDataSaver) source.getPlayer();
        assert playerData != null;
        Text name = player.getName();

        if(playerData.getPersistentData().contains("copperPoints", NbtElement.INT_TYPE))
        {
            int points = playerData.getPersistentData().getInt("copperPoints") + count;
            playerData.getPersistentData().putInt("copperPoints", points);
            source.sendFeedback(() -> Text.translatable("commands.copperPointsChange.success", name, points), true);
        } else {
            playerData.getPersistentData().putInt("copperPoints", count);
            source.sendFeedback(() -> Text.translatable("commands.copperPointsChange.success", name, count), true);
        }

        return 1;
    }

    private static int subtractCopperPoints(ServerCommandSource source, PlayerEntity player, int count)
    {
        IEntityDataSaver playerData = (IEntityDataSaver) player;
        assert playerData != null;
        Text name = player.getName();

        if(playerData.getPersistentData().contains("copperPoints", NbtElement.INT_TYPE))
        {
            int playerCopperPoints = playerData.getPersistentData().getInt("copperPoints");
            playerCopperPoints = playerCopperPoints >= count ? playerCopperPoints - count: 0;
            playerData.getPersistentData().putInt("copperPoints", playerCopperPoints);
            source.sendFeedback(() -> Text.translatable("commands.copperPointsChange.success", name, playerData.getPersistentData().getInt("copperPoints")), true);
        } else {
            source.sendFeedback(() -> Text.literal("Source has not initiated field copper points."), true);
        }


        return 1;
    }

    private static int clearCopperPoints(ServerCommandSource source, PlayerEntity player)
    {
        IEntityDataSaver playerData = (IEntityDataSaver) player;
        assert playerData != null;
        Text name = player.getName();

        if(playerData.getPersistentData().contains("copperPoints", NbtElement.INT_TYPE))
        {
            playerData.getPersistentData().putInt("copperPoints", 0);
            source.sendFeedback(() -> Text.translatable("commands.copperPointsClear.success", name), true);
        } else {
            source.sendFeedback(() -> Text.literal("Source has not initiated field copper points."), true);
        }

        return 1;
    }
}
