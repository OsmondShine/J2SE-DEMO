package com.xl.advanced.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-17
 * @description 
 * @version 1.0
 */

public class TestIO_1 {
	public static void main(String[] args) throws Exception{
		/*FileReader fr = new FileReader("E:\\学生管理.txt");
//		FileInputStream fr = new FileInputStream("E:\\学生管理.txt");
		int ch;
		int cnt = 0;
		
		ch = fr.read();
		while(-1 != ch){
			cnt ++;
			System.out.println((char)ch);
			ch = fr.read();
		}
		System.out.println("该文件字符的个数是：" + cnt);
		fr.close();*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		System.out.println(line);//由于字符嘛是GBK，所以出现乱码
	    line=new String(line.getBytes("GBK"),"UTF-8");
	    System.out.println(line);//输出中文
} 
	}


