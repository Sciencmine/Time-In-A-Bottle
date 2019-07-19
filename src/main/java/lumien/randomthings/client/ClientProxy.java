package lumien.randomthings.client;

import lumien.randomthings.CommonProxy;
import lumien.randomthings.client.models.ItemModels;
import lumien.randomthings.client.render.RenderTimeAccelerator;
import lumien.randomthings.entitys.EntityTimeAccelerator;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerModels()
	{
		ItemModels.register();
	}

	@Override
	public void registerRenderers()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityTimeAccelerator.class, new RenderTimeAccelerator(Minecraft.getMinecraft().getRenderManager()));
	}
}
