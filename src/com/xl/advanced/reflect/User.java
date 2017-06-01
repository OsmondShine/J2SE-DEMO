package com.xl.advanced.reflect;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-31
 * @description 
 * @version 1.0
 */
//标准的JavaBean类的私有方法都应该有get/set方法，有无参构造方法
public class User {
	private String username;
	private String userpass;
	private int age;
	
	public User(){}
	public User(String username, String userpass, int age) {
		super();
		this.username = username;
		this.userpass = userpass;
		this.age = age;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpass() {
		return userpass;
	}
	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

