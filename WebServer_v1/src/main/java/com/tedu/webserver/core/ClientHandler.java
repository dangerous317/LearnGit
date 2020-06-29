package com.tedu.webserver.core;

import java.net.Socket;

/**
 * 线程任务类，用于处理某个客户端的请求并予以回应
 * @author soft01
 *
 */
public class ClientHandler {
	private Socket socket;
	
	public void ClientHandler(Socket socket) {
		
	}
	public void run() {
		System.out.println("一个客户端连接起来了");
	}
}
