package com.x86cam.NoBreakBlock;

import java.util.logging.Logger;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
 
public class NoBreakBlock extends JavaPlugin {
	public static NoBreakBlock plugin;
	public final Logger logger = Logger.getLogger("Minecraft");
 
	Logger log;
 
	public void onDisable(){
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " version " + pdfFile.getVersion() + " is now disabled");
	}
 
	public void onEnable(){
		getServer().getPluginManager().registerEvents(new BlockListener(), this);
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " version " + pdfFile.getVersion() + " is now enabled");
	}
}