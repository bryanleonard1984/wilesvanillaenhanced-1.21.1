package net.bryanleonard1984.vanenhanced.event;

import net.bryanleonard1984.vanenhanced.util.IEntityDataSaver;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.minecraft.server.network.ServerPlayerEntity;

public class PlayerCopyHandler implements ServerPlayerEvents.CopyFrom
{
    @Override
    public void copyFromPlayer(ServerPlayerEntity oldPlayer, ServerPlayerEntity newPlayer, boolean alive)
    {
        ((IEntityDataSaver) newPlayer).getPersistentData().putIntArray("homepos",
                ((IEntityDataSaver) oldPlayer).getPersistentData().getIntArray("homepos"));

        ((IEntityDataSaver) newPlayer).getPersistentData().putInt("copperPoints",
                ((IEntityDataSaver) oldPlayer).getPersistentData().getInt("copperPoints"));
    }
}
