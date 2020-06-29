package com.tedu.webserver.core;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * WebServer主类
 * @author soft01
 *
 */
public class WebServer {
	private ServerSocket server;
	
	public WebServer() {
		try {
			server = new ServerSocket(8080);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void start() {
		try {
			Socket socket = server.accept();
			ClientHandler handler = new ClientHandler();
			Thread t = new Thread();
			t.start();
		} catch (Exception e) {
		}
	}
	
	public static void main(String[] args) {
		WebServer server = new WebServer();
		server.start();
	}
}
