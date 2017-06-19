package apiTutorial.entity;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderSaiga extends RenderLiving
{
		
	public RenderSaiga(ModelSaiga saiga)
	{
		super(saiga, 1.0f);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
		return null;
	}

}
