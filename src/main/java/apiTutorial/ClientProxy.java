package apiTutorial;

import apiTutorial.entity.EntitySaiga;
import apiTutorial.entity.ModelSaiga;
import apiTutorial.entity.RenderSaiga;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.util.ResourceLocation;

public class ClientProxy extends CommonProxy {

	private ResourceLocation saigaModelRL = new ResourceLocation("mod_saiga_test:models/Saiga.obm");
	private ResourceLocation saigaTextureRL = new ResourceLocation("mod_saiga_test:models/Saiga.png");
	
	public void registerRendering()
	{
		RenderSaiga saigaRenderer = new RenderSaiga(new ModelSaiga());
		RenderingRegistry.registerEntityRenderingHandler(EntitySaiga.class, saigaRenderer);
	}
	
	
}
