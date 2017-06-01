package com.xl.advanced.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*	2017年3月8日10:28:24
 * 		总结：
 * 			用FileReader读取文件中的数据，并在显示器上输出
 */
public class TestFileReader {
	public static void main(String[] args) {
		FileReader fr = null;

		try {
			fr = new FileReader("E:\\学生管理.txt");
			
			int cnt = 0;
			int ch;
			
			while (-1 != (ch= fr.read())){
//				System.out.println((int) ch); 这是在显示器上输出ch的整数值，所以必须转化，我们需要的是ch所代表整数的对应字符
				System.out.println((char)ch);
				++cnt;
			}
			System.out.println("总共从 E:\\学生管理.txt 文件中读取了" + cnt + "个字符");
		} catch (FileNotFoundException e) {
			System.out.println("找不到文件！");
			System.exit(-1);
		} catch (IOException e) {
			System.out.println("文件读写失败！");
			System.exit(-1);
		}
	}

}
