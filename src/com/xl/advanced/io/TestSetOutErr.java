package com.xl.advanced.io;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class TestSetOutErr {
	public static void main(String[] args) {
		PrintStream psOut = null;
		PrintStream psError = null;
		Scanner sc = null;
		
		try {
			psOut = new PrintStream("E:\\IO测试文件夹\\TestSetOut.txt");
			psError = new PrintStream("E:\\IO测试文件夹\\TestSetError.txt");
			sc = new Scanner(System.in);
			int num;
			System.setOut(psOut);
			
			while (true){
				num = sc.nextInt();
				System.out.println(num);
			}
		} catch (FileNotFoundException e) {
			System.setOut(psError);
			System.err.println("出错的信息是：");
			e.printStackTrace();
		}
	}

}
