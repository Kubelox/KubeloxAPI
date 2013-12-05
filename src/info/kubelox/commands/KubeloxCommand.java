package info.kubelox.commands;

import info.kubelox.Kubelox;
import info.kubelox.player.KubeloxPlayer;
import org.bukkit.ChatColor;

public class KubeloxCommand extends KubeloxComandHandler {

	public KubeloxCommand(Kubelox kubelox)
	{
		super(kubelox, "kubelox");
	}

	@Override
	public boolean commandPlayer(KubeloxPlayer player, String[] args)
	{
		player.sendMessage(ChatColor.AQUA +
				"This server is running Kubelox API (Version x.x)");

		player.sendMessage(ChatColor.YELLOW +
				"Read about Kubelox at http://www.kubelox.com!");

		return true;
	}
}
