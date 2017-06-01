package com.xl.advanced.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/*	2017年5月17日 11:05:18
 * 		总结：
 * 			对象的序列化与反序列化
 * 
 */
public class TestObjectIO {
	public static void main(String[] args) {
		ObjectOutputStream oos = null;
		ObjectInputStream ois =null;
		
		Student student1 = new Student("ES001", "武庚", 99.9f);
		Student student2 = null;
		
			try {
				FileOutputStream fos = new FileOutputStream("E:\\IO测试文件夹\\学生管理99.txt");
				oos = new ObjectOutputStream(fos);
				oos.writeObject(student1);
				ois = new ObjectInputStream(new FileInputStream("E:\\IO�����ļ���\\ѧ�����99.txt"));
				/*	(Student) 不能省 
				 *	 如果ois中的某个成员被transient修饰,则该成员是不会被读取的，因为根本就没有被保存
				 */
				student2 = (Student) ois.readObject();
				
				System.out.println("student2.fdId =" + student2.fdId);
				System.out.println("student2.fdName =" + student2.fdName );
				System.out.println("student2.fdScore =" + student2.fdScore );
			} catch (FileNotFoundException e) {
				System.out.println("文件没有找到！");
				System.exit(-1);
			} catch (IOException e) {
				System.out.println("文件读写失败！");
				System.exit(-1);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				System.exit(-1);
			} finally{
				try {
					oos.close();
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
					System.exit(-1);
				}
			}
	}
}
