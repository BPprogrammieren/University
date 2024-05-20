package exercise4;


import java.net.*;

import exercise3.PhoneBook;

import java.io.*;

public class TCPServer {
	PhoneBook book1 = new PhoneBook("book1");
	PhoneBook book2 = new PhoneBook("book2");
	
  public static void main (String args[]) {
    try{
      System.out.println("The Server is running");
	  int serverPort = 1236;
	  ServerSocket listenSocket = new ServerSocket (serverPort);
	  while(true) {
	    Socket clientSocket = listenSocket.accept();
	    System. out.println("New Connection");
	    Connection c = new Connection(clientSocket);
	    String name = c.in.readUTF ();
	    System.out.println("name: " + name);
	    c.out.writeUTF(name);
	    String phoneNumber = c.in.readUTF ();
	    System.out.println("phone: " + phoneNumber);
	    c.out.writeUTF(phoneNumber);
	    String description = c.in.readUTF ();
	    System.out.println("phone: " + description);
	    c.out.writeUTF(description);
	  }
    } catch( IOException e) {System.out.println(" Listen :"+ e.getMessage());}
  }// main
}//class


class Connection extends Thread {
  DataInputStream in;
  DataOutputStream out;
  Socket clientSocket;

  public Connection (Socket aClientSocket) {
    try {
      clientSocket = aClientSocket;
      out = new DataOutputStream ( clientSocket.getOutputStream() );
      in = new DataInputStream ( clientSocket.getInputStream() );     
      this.start();
    } catch( IOException e) {System. out. println(" Connection:"+ e.getMessage());}
  }

  public void run(){
    try {
      String data = in.readUTF ();
	  out.writeUTF(data);
	  
	  System.out.println("Sent data: " + data);	  
    } catch( EOFException e) {System.out.println(" EOF:"+ e.getMessage());
    } catch( IOException e) {System.out.println(" IO:"+ e.getMessage());}
  }
}