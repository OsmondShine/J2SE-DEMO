package com.xl.designpattern.command_2;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-25
 * @description 
 * @version 1.0
 */

class ControlPanel {
	private static final int CONTROL_SIZE = 9;
	private Command[] commands;
	
	public ControlPanel(){
		commands = new Command[CONTROL_SIZE];
		
		for (int i = 0; i < CONTROL_SIZE; i++){
			commands[i] = new NoCommand();
		}
	}
	
	public void setCommand(int index, Command command){
		if (CONTROL_SIZE > index){
			commands[index] = command;
		}else {
			//用于防止数组下标越界
			return;
		}
		System.out.println("1111");
	}
	
	public void keyPressed(int index){
		if (CONTROL_SIZE > index){
			commands[index].execute();
		}else {
			//用于防止数组下标越界
			return;
		}
		System.out.println("222");
	}
}

