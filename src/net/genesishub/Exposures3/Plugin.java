package net.genesishub.Exposures3;

import net.genesishub.Exposures3.PluginManager.State;

public interface Plugin {
	public static State state = null;
	public static String name = null;
	public static String version = null;
	public void Enable();
	public void Disable();
}
