package net.genesishub.Exposures3;

/*
 * Exposure Server Plugin
 * NAME: ExposurePlugin
 * DESCRIPTION: Basic Plugin
 * CREATOR: _InDev_ 
 */

public class ExposurePlugin{
	
	public static String name = "ExposurePlugin";
	public static String version = "0.0.1";
	
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
