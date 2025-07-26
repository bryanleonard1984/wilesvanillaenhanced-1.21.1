package net.bryanleonard1984.vanenhanced.mixin;

import net.bryanleonard1984.vanenhanced.util.IEntityDataSaver;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NbtCompound;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Entity.class)
public abstract class ModEntityDataSaverMixin implements IEntityDataSaver
{
    @Unique
    private NbtCompound persistentData;

    @Override
    public NbtCompound getPersistentData()
    {
        if(persistentData == null)
        {
            this.persistentData = new NbtCompound();
        }
        return persistentData;
    }

    @Inject(method = "writeNbt", at = @At("HEAD"))
    protected void injectWriteMethod(NbtCompound nbt, CallbackInfoReturnable<NbtCompound> info)
    {
        if(this.persistentData != null)
        {
            nbt.put("vanenhanced.custom_data", persistentData);
        }
    }

    @Inject(method = "readNbt", at = @At("HEAD"))
    protected void injectReadMethod(NbtCompound nbt, CallbackInfo info)
    {
        if(nbt.contains("vanenhanced.custom_data", 10))
        {
            this.persistentData = nbt.getCompound("vanenhanced.custom_data");
        }
    }

}
