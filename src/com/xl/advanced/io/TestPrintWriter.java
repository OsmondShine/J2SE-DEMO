package com.xl.advanced.io;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
/*	2017年5月17日 11:24:14
 * 		通过键盘向某个文件写入数据，如果输入exit，则程序终止ֹ
 */
public class TestPrintWriter {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		OutputStreamWriter pw = null;
		System.out.println("系统编码：" + System.getProperty("file.encoding"));
		
		try {
//			pw = new PrintWriter(new OutputStreamWriter( new FileOutputStream("E:\\IO测试文件夹\\学生管理4.txt", true),"UTF-8"));
//			pw = new PrintStream("E:\\IO测试文件夹\\学生管理4.txt");
			pw = new OutputStreamWriter(new FileOutputStream("E:\\IO测试文件夹\\学生管理4.txt", true),"UTF-8");
			String strRec = null;
			//br.readLine遇到回车时，终止本行读取，并将换行符自动丢弃
			while (null != (strRec=br.readLine())){
				if (strRec.equalsIgnoreCase("exit"))
					break;
			
				strRec=new String(strRec.getBytes("GBK"),"UTF-8");
			    System.out.println(strRec);//输出中文
				pw.write(strRec);
			}
			pw.flush();
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(-1);
		} finally{
			pw.close();
		}
	}

}
