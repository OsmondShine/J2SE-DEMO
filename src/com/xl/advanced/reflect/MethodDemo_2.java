package com.xl.advanced.reflect;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-31
 * @description 
 * @version 1.0
 */

public class MethodDemo_2 {
	public static void main(String[] args) {
		UserService userService = new UserService();
		
		/* 通过键盘输入命令执行操作
		 * 输入命令update就执行update方法
		 * 输入命令delete就执行delete方法
		 * ........
		 */
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("请输入命令：");
			String action = br.readLine();
	/*		if ("update".equals(action)){
				userService.update();
			}
			if ("delete".equals(action)){
				userService.delete();
			}
			if ("find".equals(action)){
				userService.find();
			}*/
			/*action就是方法名称，都没有参数---->通过方法的反射操作就会简单很多
			 * 通过方法对象进行反射操作
			 */
			Class c = userService.getClass();
			Method m = c.getMethod(action);
			m.invoke(userService);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

