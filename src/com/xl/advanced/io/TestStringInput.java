package com.xl.advanced.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*	2017年5月17日 14:09:11
 * 		总结：
 * 			将键盘输入的字符组成字符串赋给String对象
 */

public class TestStringInput {
	public static void main(String[] args) {
		String str = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			str = br.readLine();
			System.out.println("str = " + str);
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(-1);
		} finally{
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
				System.exit(-1);
			}
		}
	}
}
