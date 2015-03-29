package net.genesishub.Exposures3;

import net.genesishub.Exposures3.PluginManager.State;

public interface Plugin {
	public static State state = State.DISABLE;
	public static String name = "Default";
	public static String version = "0.0.0";
	public void Enable();
	public void Disable();
}
