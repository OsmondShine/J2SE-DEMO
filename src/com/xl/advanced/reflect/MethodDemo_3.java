package com.xl.advanced.reflect;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-31
 * @description 
 * @version 1.0
 */

public class MethodDemo_3 {
	public static void main(String[] args) {
//		User user = new User("zhangsan", "123", 21);
		User user = new User();
		BeanUtil.setValueByPropertyName(user, "username", "lisi");
		System.out.println(BeanUtil.getValueByPropertyName(user, "username"));
//		System.out.println(BeanUtil.getValueByPropertyName(user, "userpass"));
	}
}

