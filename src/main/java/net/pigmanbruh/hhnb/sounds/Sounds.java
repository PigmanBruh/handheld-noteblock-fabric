package net.pigmanbruh.hhnb.sounds;

import net.minecraft.sound.SoundEvent;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Sounds {

    public static final Identifier HHNB_HARP = new Identifier("minecraft:block.note_block.harp");
    public static SoundEvent HHNB_HARP_EVENT = SoundEvent.of(HHNB_HARP);

    public static void registerSounds() {
        Registry.register(Registries.SOUND_EVENT, HHNB_HARP, HHNB_HARP_EVENT);
    }
}