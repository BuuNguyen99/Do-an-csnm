package Interface.interfaces;
import java.rmi.Remote;
import java.rmi.RemoteException;

import javax.swing.ImageIcon;

import Interface.bean.client;

public interface ClientInterface extends Remote {

	public static enum Task {
		SHUTDOWN, RESTART, LOG_OFF, LOCK
	};

	void doClientTasks(Task task) throws RemoteException;

	void setClientInfo(String status) throws RemoteException;

	public void showServerMessage(String message) throws RemoteException;

	void setTime(int status) throws RemoteException;
	
	public client getClient() throws RemoteException;
	
	public boolean checkConnect() throws RemoteException;
	
}
