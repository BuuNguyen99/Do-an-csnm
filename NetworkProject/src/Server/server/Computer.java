package Server.server;

import java.io.Serializable;

public class Computer implements Serializable {
	
	//get and set ip name client
	private static final long serialVersionUID = 1L;
	private String name;
	private String ipAddress;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public Computer(String name, String ipAddress) {
		super();
		this.name = name;
		this.ipAddress = ipAddress;
	}
	@Override
	public String toString() {
		return "Computer [name=" + name + ", ipAddress=" + ipAddress + "]";
	}
	
	
}
