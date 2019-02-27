package com.somenew.giminey.event;

//import cpw.mods.fml.common.eventhandler.Cancelable;
//import cpw.mods.fml.common.eventhandler.EventBus;
//import net.minecraft.entity.player.EntityPlayer;
//import net.minecraft.item.ItemArmor;
//import net.minecraft.world.World;
//import net.minecraftforge.common.MinecraftForge;
//
//public class EventLoader {
//	
//	public static final EventBus EVENT_BUS = new EventBus();
//	
//	public void RegisterEvent() {
//		MinecraftForge.EVENT_BUS.register(this);
//		EventLoader.EVENT_BUS.register(this);
//	}
//	
//	@Cancelable
//	public class PlayerWearArmorEvent extends net.minecraftforge.event.entity.player.PlayerEvent{
//
//		public final ItemArmor Armor;
//	    public final World world;
//	    
//		public PlayerWearArmorEvent(EntityPlayer player,ItemArmor Armor,World world) {
//			super(player);
//			this.Armor=Armor;
//			this.world = world;
//			
//		}
//
//	}
//}
