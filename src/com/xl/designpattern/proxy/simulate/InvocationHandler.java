package com.xl.designpattern.proxy.simulate;

import java.lang.reflect.Method;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-6-1
 * @description 
 * @version 1.0
 */

public interface InvocationHandler {
	
	public void invoke(Object obj, Method m);
}

