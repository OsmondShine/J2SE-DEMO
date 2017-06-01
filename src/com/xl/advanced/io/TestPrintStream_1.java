package com.xl.advanced.io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class TestPrintStream_1 {
	public static void main(String[] args) throws Exception {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("E:\\IO测试文件夹\\学生管理.txt"));
		dos.writeLong(1500);
		dos.close();
		System.out.printf("%#X\n", 1500);
		
		PrintStream ps = new PrintStream(new FileOutputStream("E:\\IO测试文件夹\\学生管理2.txt"),true);
		ps.println("中华人民共和国");
		ps.close();
	}

}
