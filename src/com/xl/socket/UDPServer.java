package com.xl.socket;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-16
 * @description 
 * @version 1.0
 */

public class UDPServer {
	public static void main(String[] args) throws Exception {
		String response = "首长好！";
		//定义码头
		DatagramSocket ds = new DatagramSocket(5678);
		byte[] buf = new byte[1024];
		
		//定义可以用来接收数据的集装箱
		DatagramPacket dp = new DatagramPacket(buf, buf.length);
		
		try{
			while(true){
				ds.receive(dp);
				ByteArrayInputStream bais = new ByteArrayInputStream(dp.getData());
				DataInputStream dis = new DataInputStream(bais);
				System.out.println("客户端请求：" + DataInputStream.readUTF(dis));
				System.out.println("服务器端响应：" + response);
				System.out.println("-----------------------");
			}
		}catch(Exception e){
			
		}
		
	}
}

