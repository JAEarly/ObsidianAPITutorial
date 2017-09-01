package apiTutorial;

import apiTutorial.entity.EntityAIEat;
import apiTutorial.entity.EntitySaiga;
import net.minecraft.util.ResourceLocation;
import obsidianAPI.ObsidianAPIUtil;
import obsidianAPI.animation.wrapper.AIAnimationWrapper;
import obsidianAPI.animation.wrapper.FunctionAnimationWrapper.IsActiveFunction;
import obsidianAPI.registry.AnimationRegistry;

public class CommonProxy {

	private ResourceLocation saigaWalk = new ResourceLocation("mod_api_tutorial:animations/Walk.oba");
	private ResourceLocation saigaIdle = new ResourceLocation("mod_api_tutorial:animations/SaigaIdle.oba");
	private ResourceLocation saigaEat = new ResourceLocation("mod_api_tutorial:animations/SaigaEat.oba");
	private ResourceLocation saigaCall = new ResourceLocation("mod_api_tutorial:animations/SaigaCall.oba");
	
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
		
		IsActiveFunction isSaigaEating = (entity) -> {
			return entity instanceof EntitySaiga ? ((EntitySaiga) entity).isCalling() : false;
		};
		
		AnimationRegistry.registerEntity(EntitySaiga.class, "saiga");
		AnimationRegistry.registerAnimation("saiga", "walk", saigaWalk, 0, true, isWalking);
		AnimationRegistry.registerAnimation("saiga", EntityAIEat.name, new AIAnimationWrapper(EntityAIEat.name, saigaEat, 10, true));
		AnimationRegistry.registerAnimation("saiga", "call", saigaCall, 40, false, isSaigaEating);
		AnimationRegistry.registerAnimation("saiga", "idle", saigaIdle, 50, true, returnTrue);

		
	}
	
}
