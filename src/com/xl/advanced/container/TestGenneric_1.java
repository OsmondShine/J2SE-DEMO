package com.xl.advanced.container;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-22
 * @description 
 * @version 1.0
 */

class IntegerFoo{
	private Integer foo;

	public Integer getFoo() {
		return foo;
	}

	public void setFoo(Integer foo) {
		this.foo = foo;
	}
}
class StringFoo{
	private String foo;

	public String getFoo() {
		return foo;
	}

	public void setFoo(String foo) {
		this.foo = foo;
	}
}
public class TestGenneric_1 {
	public static void main(String[] args) {
		IntegerFoo foo1 = new IntegerFoo();
		foo1.setFoo(new Integer(55));
		Integer it = foo1.getFoo();
		System.out.println(it.floatValue());
		
		StringFoo foo2 = new StringFoo();
		foo2.setFoo(new String("zhangsan"));
		String st = foo2.getFoo();
		System.out.println(st.equals("zhangsan"));
	
		System.out.println("嘿嘿");
	}
}

/*55.0
true
嘿嘿*/