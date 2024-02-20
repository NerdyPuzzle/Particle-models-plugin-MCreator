package net.nerdypuzzle.particlemodels.parts;

import net.mcreator.element.ModElementType;
import net.nerdypuzzle.particlemodels.elements.ParticleModel;
import net.nerdypuzzle.particlemodels.elements.ParticleModelGUI;

import static net.mcreator.element.ModElementTypeLoader.register;

public class PluginElementTypes {
    public static ModElementType<?> PARTICLEMODEL;

    public static void load() {

        PARTICLEMODEL = register(
                new ModElementType<>("particlemodel", (Character) null, ParticleModelGUI::new, ParticleModel.class)
        );

    }

}
