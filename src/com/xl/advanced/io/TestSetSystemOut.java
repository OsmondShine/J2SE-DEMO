package com.xl.advanced.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
/*		2017年5月17日 14:03:02
 * 		总结：
 * 			程序主要实现的是：将输出信息由原来的控制台重定向到指定的地址
 * 			注意编码问题，要求写入编码与读出时编码一致，否则将出现乱码
 * 			可以用line=new String(line.getBytes("GBK"),"UTF-8")实现字符编码转换
 * 
 */
public class TestSetSystemOut {
	public static void main(String[] args) {
		PrintStream psOut = null;
		
		try {
			System.out.println("系统编码：" + System.getProperty("file.encoding"));
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
