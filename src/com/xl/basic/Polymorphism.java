package com.xl.basic;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-16
 * @description 
 * @version 1.0
 */

class Person{
	public String name ="青龙";
	private String idCard = "12345";

	public String getName() {
		System.out.println("我是Person的getName()");
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
}
class Student extends Person{
	public static long STU_ID;
	private static long nextID = 0;
	
	public Student(){
		STU_ID = nextID ++;
	}

	public static long getSTU_ID() {
		return STU_ID;
	}

	public static void setSTU_ID(long sTU_ID) {
		STU_ID = sTU_ID;
	}

	public static long getNextID() {
		return nextID;
	}

	public static void setNextID(long nextID) {
		Student.nextID = nextID;
	}

	@Override
	public String getName() {
		System.out.println("我是Student的getName()");
		return null;
	}
	
}

public class Polymorphism {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person person = new Student();
		Student student = (Student)person;
		student.getSTU_ID();
	}

}

