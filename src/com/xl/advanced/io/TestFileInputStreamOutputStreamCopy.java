package com.xl.advanced.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileInputStreamOutputStreamCopy {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;

			try {
				fis = new FileInputStream("E:\\学生管理.txt");
				fos = new FileOutputStream("E:\\IO测试文件夹\\学生管理09.txt");
				int ch;
				
				while (-1 != (ch=fis.read())){
					fos.write(ch);
				}
			} catch (FileNotFoundException e) {
				System.out.println("文件没有找到！");
				System.exit(-1);
			} catch (IOException e) {
				System.out.println("文件读写失败！");
				System.exit(-1);
			} finally{
				
				try {
					if (null != fis){
						fis.close();
						fis = null;
					}
					if (null != fos){
						fos.close();
						fos = null;
					}
				} catch (IOException e) {
					e.printStackTrace();
					System.exit(-1);
				}
				System.out.println("文件复制成功！");
			}
	}
}
