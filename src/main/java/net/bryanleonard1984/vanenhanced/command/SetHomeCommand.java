package net.bryanleonard1984.vanenhanced.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.bryanleonard1984.vanenhanced.util.IEntityDataSaver;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;

public class SetHomeCommand
{
    public static void register(CommandDispatcher<ServerCommandSource> serverCommandSourceCommandDispatcher,
                                CommandRegistryAccess commandRegistryAccess,
                                CommandManager.RegistrationEnvironment registrationEnvironment)
    {
        serverCommandSourceCommandDispatcher.register(CommandManager.literal("setHome").executes(SetHomeCommand::run));
    }

    private static int run(CommandContext<ServerCommandSource> context) throws CommandSyntaxException
    {
        IEntityDataSaver player = ((IEntityDataSaver) context.getSource().getPlayer());
        assert player != null;
        BlockPos playerPos = context.getSource().getPlayer().getBlockPos();
        String positionString = "(" + playerPos.getX() + ", " + playerPos.getY() + ", " + playerPos.getZ() + ")";

        player.getPersistentData().putIntArray("homepos",
                new int[] {playerPos.getX(), playerPos.getY(), playerPos.getZ()});

        context.getSource().sendFeedback(() -> Text.literal("Set home at " + positionString), true);
        return 1;
    }


}
