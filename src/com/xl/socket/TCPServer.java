package com.xl.socket;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;


/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-16
 * @description 
 * @version 1.0
 */

public class TCPServer {
	public static void main(String[] args) throws Exception{
		String response = "为人民服务！";
		//1.建立服务器套接字对象，并绑定服务端口号
		ServerSocket ss = new ServerSocket(6666);	//ss对象不会自动监听客户端是否有连接请求；若要监听，必须调用accept()方法
		
		while(true){
			//接受客户端连接请求
			Socket s = ss.accept();	//accept()为阻塞式方法，即若无连接请求，则程序将不往下执行
			DataInputStream dis = new DataInputStream(s.getInputStream());
			System.out.println("客户端请求：" + dis.readUTF());	//readUTF()为阻塞式方法
			System.out.println("服务器响应：" + response);
			System.out.println("---------------------");
			dis.close();
			s.close();
		}

	}
}

