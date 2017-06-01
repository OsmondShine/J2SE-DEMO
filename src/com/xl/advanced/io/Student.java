package com.xl.advanced.io;

import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = 1L;
	public String fdId;
	public String fdName;
	/*表示score成员不能被序列化，所谓不能序列化是指：
	 * 					该成员调用ObjectOutputStream的writeObject()时不会被保存,
	 * 					调用ObjectInputStream的readObject()方法时不会被读取
	 * 
	 * */
	transient public float fdScore;
	
	public Student(String fdId, String fdName, float fdScore) {
		super();
		this.fdId = fdId;
		this.fdName = fdName;
		this.fdScore = fdScore;
	}
}
