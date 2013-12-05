package info.kubelox.commands;

import info.kubelox.Kubelox;
import info.kubelox.player.KubeloxPlayer;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public abstract class KubeloxComandHandler implements CommandExecutor {

	protected Kubelox kubelox;
	protected String command;

	protected KubeloxComandHandler (Kubelox kubelox, String command)
	{
		this.kubelox = kubelox;
		this.command = command;
	}

	public String getName()
	{
		return command;
	}

	public boolean commandPlayer(KubeloxPlayer player, String[] args)
	{
		return false;
	}

	public boolean commandServer(Server server, String[] args)
	{
		return false;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
	{
		if (sender instanceof Player)
		{
			KubeloxPlayer player = kubelox.getPlayer((Player) sender);
			return commandPlayer(player, args);
		}
		else
		{
			return commandServer(sender.getServer(), args);
		}
	}



}
