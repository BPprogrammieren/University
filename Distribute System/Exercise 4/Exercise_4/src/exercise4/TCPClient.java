package exercise4;

import java.net.*;
import java.io.*;

public class TCPClient {
	public static void main (String args[]) {
	// args[0]: name
	// args[1]: phone number
	// args[2]: description
	// args[3]: Server
  
    try{
	  int serverPort = 1236;
	  Socket s = new Socket (args[3], serverPort);
	  DataOutputStream out = new DataOutputStream ( s.getOutputStream());
	  DataInputStream in = new DataInputStream ( s.getInputStream());
	  
	  out.writeUTF (args[0]);
	  String name = in.readUTF ();
	  
	  out.writeUTF (args[1]);
	  String phoneNumber = in.readUTF ();
	  
	  out.writeUTF (args[2]);  
	  String description = in.readUTF ();
	  
	  System.out.println("Received: name as "+ name) ;
	  System.out.println("Received: phone number as "+ phoneNumber) ;
	  System.out.println("Received: description as "+ description) ;
	  
	  s.close();
    }catch (UnknownHostException e){
	  System.out.println(" Sock:"+ e.getMessage());
    }catch (EOFException e){ System.out.println(" EOF:"+ e.getMessage());
    }catch (IOException e){ System.out.println(" IO:"+ e.getMessage());}
  }// main
}// class