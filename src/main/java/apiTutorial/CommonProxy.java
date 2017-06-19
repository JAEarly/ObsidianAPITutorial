package apiTutorial;

import apiTutorial.entity.EntityAIEat;
import apiTutorial.entity.EntitySaiga;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import obsidianAPI.ObsidianAPIUtil;
import obsidianAPI.animation.wrapper.FunctionAnimationWrapper.IsActiveFunction;
import obsidianAPI.registry.AnimationRegistry;

public class CommonProxy {

	private ResourceLocation saigaWalk = new ResourceLocation("mod_api_tutorial:animations/Walk.oba");
	private ResourceLocation saigaEat = new ResourceLocation("mod_api_tutorial:animations/SaigaEat.oba");
	private ResourceLocation saigaIdle = new ResourceLocation("mod_api_tutorial:animations/SaigaIdle.oba");
	
	public void init() 
	{	
		ModEntities.registerEntities();
		registerRendering();
		registerAnimations();
	}

	public void registerRendering() {}
	
	public void registerAnimations() {
		AnimationRegistry.init();
		
		IsActiveFunction isWalking = (entity) -> {
			return ObsidianAPIUtil.isEntityMoving(entity);
		};
		
		IsActiveFunction returnTrue = (entity) -> {
			return true;
		};
		
		AnimationRegistry.registerEntity(EntitySaiga.class, "saiga");
		AnimationRegistry.registerAnimation("saiga", "walk", saigaWalk, 0, true, isWalking);
		AnimationRegistry.registerAnimation("saiga", "idle", saigaIdle, 50, true, returnTrue);
	}
	
}
