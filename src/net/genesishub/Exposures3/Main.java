package net.genesishub.Exposures3;

import net.genesishub.Exposure3.Protocol.*;
public class Main {
	
	static Run run;
	@SuppressWarnings("all")
	public static void main(String args[]) throws Exception{
		
		String VERSION = "0.1-DEV"; //Exposure Server Version
		String APIVERSION = "0.1-DEV"; //Exposure API Version
		
		System.out.println("[INFO] Starting Exposure3 " + VERSION + " (Implementing Exposure API version " + APIVERSION + ")");
		System.out.println("[INFO] Enabling Plugins...");
		run.start();
		System.out.println("[INFO] Starting Server...");
		Protocol.main();
	}
}
