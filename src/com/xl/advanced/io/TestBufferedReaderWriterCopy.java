package com.xl.advanced.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferedReaderWriterCopy {
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new FileReader("E:\\学生管理.txt"));
			bw = new BufferedWriter(new FileWriter("E:\\IO测试文件夹\\学生管理09.txt"));
			
			String str = null;
			//br.readLine()读取一行字符，但会将读取到的换行符自动丢弃，即返回的String对象并不包含换行符
			while (null != (str=br.readLine())){
				bw.write(str);
				//写入一个换行符，不能省
				bw.newLine();
			}
			bw.flush();
		} catch (FileNotFoundException e) {
			System.out.println("没有找到指定文件！");
			System.exit(-1);
		} catch (IOException e) {
			System.out.println("文件读写失败！");
			System.exit(-1);
		}finally{
			try {
				br.close();
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();	
				System.exit(-1);
			}
			System.out.println("文件复制成功！");
		}
	}

}
