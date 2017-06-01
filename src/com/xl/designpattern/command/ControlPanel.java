package com.xl.designpattern.command;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-25
 * @description 控制仪表盘，共设9个按钮
 * @version 1.0
 */

public class ControlPanel {
	//设置控制按钮数量
	private static final int CONTROL_SIZE = 9;
	//控制命令
	private ICommand[] commands;
	
	public ControlPanel(){
		commands = new ICommand[CONTROL_SIZE];
		//初始化所有按钮指向空对象
		for (int i = 0; i < CONTROL_SIZE; i++){
			commands[i] = new NoCommand();
		}
	}
	
	//设置每个按钮对应的命令
	public void setCommand(int index, ICommand command){
		if (CONTROL_SIZE > index){
			commands[index] = command;
		}else {
			//用于防止数组下标越界
			return;
		}
	}
	
	//模拟点击按钮
	public void keyPressed(int index){
		if (CONTROL_SIZE > index){
			commands[index].execute();
		}else {
			//用于防止数组下标越界
			return;
		}
	}
}

