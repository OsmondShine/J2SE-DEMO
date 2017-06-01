package com.xl.socket;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-16
 * @description 
 * @version 1.0
 */

public class UDPClient {
	public static void main(String[] args) throws Exception {
		//定义码头
		DatagramSocket ds = new DatagramSocket();
		//将要发送的货物转化成字节数组
		String request = "同志们好！";
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(baos);
		dos.writeUTF(request);
		
		byte[] buf = baos.toByteArray();
		//定义装载数据的集装箱，并装入数据
		DatagramPacket dp = new DatagramPacket(buf, buf.length, new InetSocketAddress("127.0.0.1", 5678));
		//发送数据
		ds.send(dp);
		//关闭码头
		ds.close();
	}

}

