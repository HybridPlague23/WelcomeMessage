package me.hybridplague.welcomemessage;

import org.bukkit.plugin.java.JavaPlugin;

public class WelcomeMessage extends JavaPlugin {

	@Override
	public void onEnable() {
		getCommand("hi").setExecutor(new WelcomeCommand());
		
		this.saveDefaultConfig();
		
	}
	
	
}
