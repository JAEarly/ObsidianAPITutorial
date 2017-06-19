package apiTutorial;

import apiTutorial.entity.EntitySaiga;
import apiTutorial.entity.ModelSaiga;
import apiTutorial.entity.RenderSaiga;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.util.ResourceLocation;
import obsidianAPI.file.importer.FileLoader;

public class ClientProxy extends CommonProxy {

	private ResourceLocation saigaModel = new ResourceLocation("mod_api_tutorial:models/Saiga.obm");
	private ResourceLocation saigaTexture = new ResourceLocation("mod_api_tutorial:models/Saiga.png");

	public void registerRendering()
	{
		RenderSaiga saigaRenderer = new RenderSaiga(FileLoader.loadModelFromResources("saiga", saigaModel, saigaTexture, ModelSaiga.class));
		RenderingRegistry.registerEntityRenderingHandler(EntitySaiga.class, saigaRenderer);
	}
	
	
}
