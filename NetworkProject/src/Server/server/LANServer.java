package Server.server;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

import Interface.interfaces.ClientInterface;

public class LANServer extends Thread{


	String host, nameClient;
	ClientInterface clientInterface;
	private static ServerClientUI server;
	static String ipadd;

	int port = 1990;
	public LANServer() throws RemoteException, UnknownHostException {
		super();
		server = new ServerClientUI();
		ipadd = InetAddress.getLocalHost().getHostAddress();
		System.out.println("ipaddress: "+ipadd);
		server.initComponentServer();
		start();
		while(true){
			if(server.checkConnectRequest()){
				start();
			}	
		}
	}
	
	public static void main(String[] args) throws RemoteException, UnknownHostException {
		new LANServer();
		
	}

	@Override
	public void run() {
		try {
			LocateRegistry.createRegistry(port);
		} catch (RemoteException e1) {
			e1.printStackTrace();
		}
		try {
			Naming.bind("rmi://"+ipadd+":"+port+"/Remote", server);
		} catch (MalformedURLException | AlreadyBoundException | RemoteException e) {
			e.printStackTrace();
		}
	}

}
