package com.xl.advanced.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-17
 * @description 
 * @version 1.0
 */

public class Test {
	public static void main(String[] args) {
PrintStream psOut = null;
		
		try {
			psOut = new PrintStream(new FileOutputStream("E:\\IO测试文件夹\\TestSetSystemOut.txt"));
			//将System.out的值设置为psOut，即输出到psOut所关联的文件，而不是原来默认的控制台
			System.setOut(psOut);
			//哈哈哈哈，输不出了吧! 将被输出到指定的文件  	(E:\\IO测试文件夹\\TestSetSystemOut.txt)
			String str = null;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str = br.readLine();
			
			System.out.println("str = " + str);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			psOut.close();
		}
	}

}

