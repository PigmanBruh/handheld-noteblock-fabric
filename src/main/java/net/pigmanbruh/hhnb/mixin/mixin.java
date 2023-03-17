package net.pigmanbruh.hhnb.mixin;

import net.pigmanbruh.hhnb.Main;

import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class mixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		Main.LOGGER.info("This line is printed by "+ Main.Mod_ID +"'s mixin (the mixin doesn't do anything yet) ");
	}
}
