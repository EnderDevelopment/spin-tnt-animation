package com.example.examplemod.mixin;

import net.minecraft.world.entity.item.PrimedTnt;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PrimedTnt.class)
public abstract class MixinPrimedTnt {
    @Inject(method = "tick", at = @At("HEAD"))
    private void onTick(CallbackInfo ci) {
        PrimedTnt tnt = (PrimedTnt) (Object) this;
        float fuseTime = tnt.getFuse();
        float maxFuseTime = 80; // Default fuse time for TNT
        float rotationSpeed = (maxFuseTime - fuseTime) / maxFuseTime * 10.0f; // Adjust the multiplier as needed
        tnt.setYRot(tnt.getYRot() + rotationSpeed);
    }
}