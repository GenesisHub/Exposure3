package net.genesishub.Exposures3;

public class Run {
	private static ExposurePlugin plugin = new ExposurePlugin();
	protected static void start(){
		plugin.Enable();
	}
	protected static void stop(){
		plugin.Disable();
	}
}
