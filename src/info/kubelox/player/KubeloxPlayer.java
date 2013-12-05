package info.kubelox.player;

import info.kubelox.Kubelox;
import org.bukkit.entity.Player;

public class KubeloxPlayer extends PlayerDelegate
{
	private Kubelox instance;

	public KubeloxPlayer (Player player, Kubelox instance)
	{
		super(player);

		this.instance = instance;
	}

	public KubeloxPlayer (String name, Kubelox instance)
	{
		super(null);

		this.instance = instance;
	}



}
