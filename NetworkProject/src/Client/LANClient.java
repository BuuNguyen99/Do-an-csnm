package Client;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.rmi.RemoteException;

public class LANClient {
	
	private static ClientUI clientUI;
	public static String clientName, ipAddress;
	public static void main(String[] args) throws RemoteException{
		new LANClient();
	}
	
	//get ip-name of client
	public LANClient() throws RemoteException{
		clientUI = new ClientUI();
		clientUI.initComponent();
		
		try {
			clientName = InetAddress.getLocalHost().getHostName();
			ipAddress = InetAddress.getLocalHost().getHostAddress();
			System.out.println("client name: "+ clientName);
			clientUI.connect();
		} catch (UnknownHostException e) {
			System.out.println("unknow name");
			e.printStackTrace();
		}
	}
	
}

