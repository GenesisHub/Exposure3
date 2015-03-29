package net.genesishub.Exposures3;

public class ExposureStart {
	/*
	 * Instantiate ExposureServer
	 */
	
	public static ExposurePlugin plugin = Exposure.getPluginManager();
	
	public static void start(){
		plugin.Enable();
	}
}
