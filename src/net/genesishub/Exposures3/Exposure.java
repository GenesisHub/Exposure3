package net.genesishub.Exposures3;

public class Exposure {
	public static ExposureServer server = new ExposureServer();
	public static ExposurePlugin pluginmanager = new ExposurePlugin();
	public static ExposureServer getServer(){
		return server;
	}
	public static ExposurePlugin getPluginManager(){
		return pluginmanager;
	}
}
