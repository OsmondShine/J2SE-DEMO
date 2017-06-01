package com.xl.advanced.container;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-22
 * @description 
 * @version 1.0
 */
class ObjectFoo{
	private Object foo;

	public ObjectFoo() {}
	public ObjectFoo(Object foo) {
		this.foo = foo;
	}
	public Object getFoo() {
		return foo;
	}
	public void setFoo(Object foo) {
		this.foo = foo;
	}
}
public class TestGeneric_2 {
	public static void main(String[] args) {
		ObjectFoo foo1 = new ObjectFoo();
		foo1.setFoo(new Integer(32));
		Integer it = (Integer)foo1.getFoo();
		System.out.println(it.floatValue());

		ObjectFoo foo2 = new ObjectFoo();
		foo2.setFoo(new String("zhangsan"));
		String st = (String)foo2.getFoo();
		System.out.println(st.equals("lisi"));
		
	}

}

