package notacyborg.firstmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = TutorialMod.MODID)
public class RegistryHandler 
{
	@SubscribeEvent
	public static void registerItems(Register<Item> event)
	{
		final Item[] items = {
				new Item().setRegistryName(TutorialMod.MODID, "first_item").setTranslationKey(TutorialMod.MODID + "." + "first_item").setCreativeTab(CreativeTabs.MISC)
		};
		event.getRegistry().registerAll(items);
	}
}
