package com.xl.socket;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-16
 * @description 
 * @version 1.0
 */
/*网络编程：用于不同主机之间的相互通信*/
public class TCPClient {
	public static void main(String[] args) throws Exception{
		//1.创建Socket套接字对象，向ip为127.0.0.1的服务器的6666服务端口请求建立连接
		Socket s = new Socket("127.0.0.1",6666);
		//2.获取连接链路,并写入数据
		OutputStream os = s.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		dos.writeUTF("同志们辛苦了！");
		dos.flush();
		//3.关闭连接
		s.close();
	}
}

