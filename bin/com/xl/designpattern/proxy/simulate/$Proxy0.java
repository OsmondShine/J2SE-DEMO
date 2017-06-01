package com.xl.designpattern.proxy.simulate;
import java.lang.reflect.Method;
import com.xl.designpattern.proxy.simulate.InvocationHandler;
public class $Proxy0 implements com.xl.designpattern.proxy.simulate.Moveable{
	public $Proxy0(InvocationHandler h){
		this.h = h;
	}
	private InvocationHandler h;
@Override
public void move(){
try{
Method md = com.xl.designpattern.proxy.simulate.Moveable.class.getMethod("move");
h.invoke(this,md);
}catch(Exception e){ e.printStackTrace();}
 }
}