package net.genesishub.Exposures3;

public class Run {
	static Plugin plugin;
	protected static void start(){
		plugin.Enable();
	}
	protected static void stop(){
		plugin.Disable();
	}
}
