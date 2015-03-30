package net.genesishub.Exposures3.Protocol;

import java.net.*;
import java.io.*;

//I have no clue what im doing.
public class Protocol {
	@SuppressWarnings("all")
	public static void main() throws Exception
    {
       String clientSentence;
       int port = 25565;
       System.out.println("[INFO] Binding to port: " + port);
       ServerSocket minecraftSocket = new ServerSocket(port);
       while(true)
       {
          Socket connectionSocket = minecraftSocket.accept();
          BufferedReader inFromClient =
             new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
          DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
          clientSentence = inFromClient.readLine();
          System.out.println("Received: " + clientSentence);
          outToClient.writeByte(0x00);
       }
    }
}