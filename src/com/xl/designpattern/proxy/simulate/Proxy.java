package com.xl.designpattern.proxy.simulate;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

import org.apache.commons.io.FileUtils;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-6-1
 * @description 
 * @version 1.0
 */

public class Proxy {

	public static Object newProxyInstance(Class infce, InvocationHandler h) throws Exception{
		String rt = "\r\n";
		String methodStr = "";
		for(Method m: infce.getMethods()){
			methodStr += "@Override" + rt +
					"public void " + m.getName() + "(){" + rt +
					"try{" + rt +
					"Method md = " + infce.getName() + ".class.getMethod(\""
						+m.getName() + "\");" + rt +
					"h.invoke(this,md);" + rt +
					"}catch(Exception e){ e.printStackTrace();}" + rt +
					" }";
		}
		
		String str = 
				"package com.xl.designpattern.proxy.simulate;" + rt +
				"import java.lang.reflect.Method;" + rt +
				"import com.xl.designpattern.proxy.simulate.InvocationHandler;" +  rt+
				"public class $Proxy0 implements " + infce.getName() + "{" + rt +
				"	public $Proxy0(InvocationHandler h){" + rt +
				"		this.h = h;" + rt +
				"	}" +rt +
				"	private InvocationHandler h;" + rt +
				methodStr + rt +
				"}";
		//产生代理的java文件
		String filename = System.getProperty("user.dir") + "/bin/com/xl/designpattern/proxy/simulate/$Proxy0.java";
		File file = new File(filename);
		FileUtils.writeStringToFile(file, str);
		
		//编译
		//拿到编译器
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		//文件管理者
		StandardJavaFileManager fileMgr = compiler.getStandardFileManager(null, null, null);
		//获取文件
		Iterable units = fileMgr.getJavaFileObjects(filename);
		//获取编译任务
		CompilationTask cTask = compiler.getTask(null, fileMgr, null, null, null, units);
		cTask.call();
		fileMgr.close();
		
		//load到内存
		ClassLoader cl = ClassLoader.getSystemClassLoader();
		Class c = cl.loadClass("com.xl.designpattern.proxy.simulate.$Proxy0");
		
		Constructor ctr = c.getConstructor(InvocationHandler.class);
		return ctr.newInstance(h);
	}
}

