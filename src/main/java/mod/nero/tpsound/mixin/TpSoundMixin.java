package mod.nero.tpsound.mixin;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.projectile.ThrownEnderpearl;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ThrownEnderpearl.class)
public abstract class TpSoundMixin {
    @Inject(method = "onHit", at = @At("HEAD"))
    private void tpsnd(HitResult pResult, CallbackInfo ci){
        ThrownEnderpearl pearl = (ThrownEnderpearl) (Object) this;
        pearl.level.playSound(null, pearl.getX(), pearl.getY(), pearl.getZ(), SoundEvents.ENDERMAN_TELEPORT, SoundSource.PLAYERS, 1.0f, 1.0f);
    }
}
