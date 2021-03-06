package example.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import example.Example;

public class Start implements CommandExecutor {

	private Example plugin = Example.getInstance();

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] a) {

		if (!sender.hasPermission("game.start")) {
			sender.sendMessage("§cNo permission!");
			return false;
		}

		plugin.getGameManager().startGame();
		return false;
	}
}