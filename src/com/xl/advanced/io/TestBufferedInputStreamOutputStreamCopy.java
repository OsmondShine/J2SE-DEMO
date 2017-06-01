package com.xl.advanced.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 * 2017年3月7日10:51:08
 * 	总结：
 * 		利用BufferedInputStream和BufferedOutputStream完成大容量文件的复制，这远远要比FileInputStream和FileOutputStream完成复制快的多
 * 		
 * 		带缓冲的包裹流必须依赖于原始流FileInputStream和FileOutputStream
 */
public class TestBufferedInputStreamOutputStreamCopy {
	public static void main(String[] args) {
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		try {
			//bis 输入流有默认的缓冲区，大小为32字节
			bis = new BufferedInputStream(new FileInputStream("F:\\BaiduYunDownload\\郝斌Java视频教程(avi格式)\\104_网络编程基础知识  UDP编程.avi"));
			//bos输出流有默认的缓冲区，大小为32字节
			bos = new BufferedOutputStream(new FileOutputStream("E:\\IO测试文件夹\\104_网络编程基础知识  UDP编程.avi"));

			byte[] buf = new byte[1024];
			//从bis所关联的设备中读取文件，读取后先存入默认缓冲区，再从缓冲区写入buf数组，每次最多向buf数组写入1024字节，返回实际写入buf数组的字节个数，如果读到文件末尾，则返回-1
			int len = bis.read(buf, 0, 1024);
			while (-1 != len){
				//将buf数组中下标从0到len-1的所有数据写入bos所关联的设备中
				bos.write(buf, 0, len);
				len = bis.read(buf);
			}
			bos.flush();
			bis.close();
			bos.close();
		} catch (FileNotFoundException e) {
			System.out.println("找不到指定文件！");
			e.printStackTrace();
			System.exit(-1);
		} catch (IOException e) {
			System.out.println("文件读写失败！");
			e.printStackTrace();
			System.exit(-1);
		}
		System.out.println("文件复制成功！");
	}
}
