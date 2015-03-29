package net.genesishub.Exposures3;
/*
 * Exposure3 Minecraft Server
 * By: Seshpenguin, _InDev_
 * Main Java file.
 */
public class Main {
	
	static Run run;
	
	
	
	@SuppressWarnings("all")
	public static void main(String args[]) throws Exception{
		
		String VERSION = "0.4-DEV"; //Exposure Server Version
		String APIVERSION = "0.3-DEV"; //Exposure API Version
		
		System.out.println("[INFO] Starting Exposure3 " + VERSION + " (Implementing Exposure API version " + APIVERSION + ")");
		System.out.println("[INFO] Enabling Plugins...");
		run.start();
		System.out.println("[INFO] Starting Server...");
		Protocol.main();
		
	}
	
	/*
	 * Writes to the Console.
	 */
	public static void write(String str){
		System.out.println(str);
	}
	
}
