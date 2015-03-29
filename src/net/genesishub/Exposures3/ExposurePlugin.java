package net.genesishub.Exposures3;

import net.genesishub.Exposures3.PluginManager.State;

public class ExposurePlugin implements Plugin{
	
	public static String name = "ExposurePlugin";
	public static String version = "0.0.1";
	public static State state;
	
	@Override
	public void Enable() {
		System.out.println("Plugin Loaded!");
	}

	@Override
	public void Disable() {
		System.out.println("Plugin Disabled!");
	}

}
