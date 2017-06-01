package com.xl.basic;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-3
 * @description 
 * @version 1.0
 */

public class TestInterface implements IBaseDao{
	@Override
	public boolean add() {
		// TODO Auto-generated method stub
		return false;
	}
	
	/**
	 * 
	 */
	private void delete() {
		// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		IBaseDao baseDao = new TestInterface();
		baseDao.add();
		TestInterface obj = (TestInterface)baseDao;
		obj.delete();
		System.out.println("学号：" + IBaseDao.STUDENT_NO);
	}

}

