package apiTutorial.entity;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.obj.WavefrontObject;
import obsidianAPI.EntityAnimationPropertiesClient;
import obsidianAPI.animation.AnimationSequence;
import obsidianAPI.render.ModelAnimated;

public class ModelSaiga extends ModelAnimated {

	public ModelSaiga(String entityName, WavefrontObject wavefrontObj, ResourceLocation textureLocation) {
		super(entityName, wavefrontObj, textureLocation);
	}

	
}
