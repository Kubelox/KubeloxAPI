package info.kubelox;

import info.kubelox.commands.KubeloxCommand;
import info.kubelox.player.KubeloxPlayer;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Map;

public class Kubelox extends JavaPlugin {

	// ====================================================
	// Global Player Variables
	// ====================================================
	private Map<String, KubeloxPlayer> players;
	private Map<Integer, KubeloxPlayer> playersId;

	// ====================================================
	// Basic Bukkit Methods
	// ====================================================
	@Override
	public void onLoad()
	{

	}

	@Override
	public void onEnable()
	{


		// ====================================================
		// Commands
		// ====================================================

		getCommand("kubelox").setExecutor(new KubeloxCommand(this));
	}

	@Override
	public void onDisable()
	{

	}

	// ====================================================
	// Player Methods
	// ====================================================

	public KubeloxPlayer getPlayer(String name)
	{
		return players.get(name);
	}

	public KubeloxPlayer getPlayer(Player player)
	{
		return players.get(player.getName());
	}

	public KubeloxPlayer getPlayer(int id)
	{
		return playersId.get(id);
	}

}
