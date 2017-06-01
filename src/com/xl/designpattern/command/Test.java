package com.xl.designpattern.command;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-25
 * @description 命令模式测试入口
 * @version 1.0
 */
/*	总结：命令模式的精髓在于：对命令的封装，实现对动作请求者和执行者的解耦。如按钮和电器那是一毛钱关系都没有啊
*/
public class Test {
	public static void main(String[] args) {
		//三个家电
		Light light = new Light();
		Door door = new Door();
		Computer computer = new Computer();
		
		//一个遥控器，假设是我们的app主界面
		ControlPanel controlPanel = new ControlPanel();
		//为每个按钮设置功能
		controlPanel.setCommand(0, new LightOnCommand(light));
		controlPanel.setCommand(1, new LightOffCommand(light));
		controlPanel.setCommand(2, new ComputerOnCommand(computer));
		controlPanel.setCommand(3, new ComputerOffCommand(computer));
		controlPanel.setCommand(50, new ComputerOffCommand(computer));	//验证是否会数组下标越界
//		controlPanel.setCommand(4, new DoorOnCommand(light));
//		controlPanel.setCommand(5, new LightOnCommand(light));
		
		//模拟点击
		controlPanel.keyPressed(0);
		controlPanel.keyPressed(1);
		controlPanel.keyPressed(2);
		controlPanel.keyPressed(3);
		controlPanel.keyPressed(8);	//这个没有设置，但是没有出现问题，这是我们NoCommand的功劳
		controlPanel.keyPressed(60);	//验证是否会数组下标越界
	
		//为满足各位屌丝的需求，特别设置一键搞定模式，具体用来干嘛，你懂得。。。。	匿名数组：new Command[]{}
		QuickCommand quickCommand = new QuickCommand(new ICommand[]{
		new DoorCloseCommand(door),new LightOffCommand(light),new ComputerOnCommand(computer)		
		});
		System.out.println("--------点击一键搞定按钮------");
		controlPanel.setCommand(8, quickCommand);	//?
		controlPanel.keyPressed(8);	//?
	}
}

