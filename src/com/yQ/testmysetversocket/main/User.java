package com.yQ.testmysetversocket.main;

import java.net.Socket;

public class User {
	private String name;
	private Socket socket;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Socket getSocket() {
		return socket;
	}

	public void setSocket(Socket socket) {
		this.socket = socket;
	}

}
