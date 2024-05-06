package mod.nero.tpsound.mixin;

import net.minecraft.world.entity.projectile.ThrownEnderpearl;
import net.minecraft.world.phys.EntityHitResult;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ThrownEnderpearl.class)
public abstract class TpSoundMixin {
    @Inject(method = "onHitEntity", at = @At("TAIL"))
    private void tpsnd(EntityHitResult pResult, CallbackInfo ci){

    }
}
