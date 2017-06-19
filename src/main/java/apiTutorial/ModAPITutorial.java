package apiTutorial;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = "ApiTutorial")
public class ModAPITutorial {

	@Mod.Instance("ApiTutorial")
	public static ModAPITutorial instance;

	@SidedProxy(serverSide = "apiTutorial.CommonProxy", clientSide = "apiTutorial.ClientProxy")
	public static CommonProxy proxy;
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{		
		instance = this;		
		proxy.init();
	}
	
}

