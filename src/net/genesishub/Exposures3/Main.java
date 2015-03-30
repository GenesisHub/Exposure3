package net.genesishub.Exposures3;
import net.genesishub.Exposures3.Protocol.Protocol;
/*
 * Exposure3 Minecraft Server
 * By: Seshpenguin, _InDev_
 * Main Java file.
 */
public class Main {
	
	private static Run run;
	
	private static ExposureStart start = new ExposureStart();
	
	@SuppressWarnings("all")
	public static void main(String args[]) throws Exception{
		
		String VERSION = "0.4-DEV"; //Exposure Server Version
		String APIVERSION = "0.3-DEV"; //Exposure API Version
		
		System.out.println("[INFO] Starting Exposure3 " + VERSION + " (Implementing Exposure API version " + APIVERSION + ")");
		System.out.println("[INFO] Enabling Plugins...");
		run.start();
		System.out.println("[INFO] Starting Server...");
		Protocol.main();
		start.start();
	}
	
	/*
	 * Writes to the Console.
	 */
	public static void write(String str){
		System.out.println(str);
	}
	
}
