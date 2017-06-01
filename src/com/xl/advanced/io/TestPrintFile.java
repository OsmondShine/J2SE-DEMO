package com.xl.advanced.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TestPrintFile {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter pw = new PrintWriter(new FileWriter("E:\\IO测试文件夹\\TestPrintFile.txt", true));
			String str = br.readLine();
			
			while (!str.equals("")){
				pw.print(str);
				str = br.readLine();
			}
			br.close();
			pw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
