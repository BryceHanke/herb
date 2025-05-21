package net.bryce.herb;

import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;

public class HerbPreLaunch implements PreLaunchEntrypoint {

	@Override
	public void onPreLaunch()
	{
		Herb.LOGGER.info("HERBPRELAUNCH");
	}
}