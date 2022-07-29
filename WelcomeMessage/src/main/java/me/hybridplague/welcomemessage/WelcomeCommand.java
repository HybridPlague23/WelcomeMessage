package me.hybridplague.welcomemessage;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;

import net.md_5.bungee.api.ChatColor;

public class WelcomeCommand implements CommandExecutor {

	private WelcomeMessage main = WelcomeMessage.getPlugin(WelcomeMessage.class);
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (sender instanceof ConsoleCommandSender) {
			return true;
		}
		
		if (sender.hasPermission("businesscraft.helper")) {
			
			Bukkit.dispatchCommand(sender, "g " + ChatColor.translateAlternateColorCodes('&', message()));
			
			
		}
		return true;
	}
	
	private String message() {
		String msg = "";
		
		Random r = new Random();
		
		int n = r.nextInt(main.getConfig().getStringList("messages").size());
		
		msg = main.getConfig().getStringList("messages").toArray()[n].toString();
		
		return msg;
	}

}
