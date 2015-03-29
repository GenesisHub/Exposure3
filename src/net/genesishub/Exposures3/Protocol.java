package net.genesishub.Exposures3;

import java.net.*;
import java.io.*;

//I have no clue what im doing.
public class Protocol {
	public static void main() throws Exception
    {
       String clientSentence;
       String capitalizedSentence;
       ServerSocket welcomeSocket = new ServerSocket(25565);

       while(true)
       {
          Socket connectionSocket = welcomeSocket.accept();
          BufferedReader inFromClient =
             new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
          DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
          clientSentence = inFromClient.readLine();
          System.out.println("Received: " + clientSentence);
          outToClient.writeByte(0x00);
       }
    }
}