package com.synctank.castcounter;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class MagicCastCounterPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(MagicCastCounterPlugin.class);
		RuneLite.main(args);
	}
}