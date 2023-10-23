package com.playercoder1;


import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.api.Client;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.api.events.GameTick;
import net.runelite.api.Player;

import javax.inject.Inject;

@PluginDescriptor(
		name = "loosecannon00",
		description = "Does what loosecannon00 said",
		tags = {"pose", "animation", "idle"}
)
public class loosecannon00 extends Plugin
{
	@Inject
	private Client client;

	@Subscribe
	public void onGameTick(GameTick event)
	{
		Player[] players = client.getCachedPlayers();
		if (players != null)
		{
			int animationId = -1;
			for (Player player : players)
			{
				if (player != null)
				{
					player.setIdlePoseAnimation(animationId);
				}
			}
		}
	}
}
