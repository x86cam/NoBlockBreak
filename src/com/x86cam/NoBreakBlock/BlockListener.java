package com.x86cam.NoBreakBlock;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockIgniteEvent;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockListener implements Listener {

	public static NoBreakBlock plugin;
	
	@EventHandler
	public void StopBreakBlock(BlockBreakEvent event){
		if(event.getPlayer().isOp()){
			event.setCancelled(false);
			return;
		}
		event.setCancelled(true);
		event.getPlayer().sendMessage(ChatColor.RED + "This server is protected from breaking blocks!");
	}
	
	@EventHandler
	public void StopBuildBlock(BlockPlaceEvent event){
		if(event.getPlayer().isOp()){
			event.setCancelled(false);
			return;
		}
		event.setCancelled(true);
		event.getPlayer().sendMessage(ChatColor.RED + "This server is protected from building blocks!");
	}
	
	@EventHandler
	public void StopIgniteBlock(BlockIgniteEvent event){
		if(event.getPlayer().isOp()){
			event.setCancelled(false);
			return;
		}
		event.setCancelled(true);
		event.getPlayer().sendMessage(ChatColor.RED + "This server is protected from igniting blocks!");
	}

}
