package net.genesishub.Exposures3;

import net.genesishub.Exposures3.PluginManager.State;

/*
 * Exposure Server Plugin
 * NAME: ExposurePlugin
 * DESCRIPTION: Basic Plugin
 * CREATOR: _InDev_ 
 */

public class ExposurePlugin implements Plugin{
	
	public static String name = "ExposurePlugin";
	public static String version = "0.0.1";
	public static State state;
	
	private static ExposureServer server = Exposure.getServer();
	
	public void Enable() {
		System.out.println("Plugin Loaded!");
	}

	public void Disable() {
		System.out.println("Plugin Disabled!");
	}
	public ExposureServer getServer(){
		return server;
	}
}
