package Server.server;

import java.util.Hashtable;

import Interface.interfaces.ClientInterface;
import Interface.interfaces.ServerInterface;

//create connect server vs client
//1 tien trinh nhieu thread chay // nhau
public class ThreadConnection extends Thread {
	ServerInterface serverInterface;
	ClientInterface clientInterface;
	int numOfClient;
	private Hashtable<ClientInterface, ThreadConnection> allConnections = 
			new Hashtable<ClientInterface, ThreadConnection>();
	
	public ThreadConnection() {
	}
	
	public void connectSyn(){
		
	}
}

