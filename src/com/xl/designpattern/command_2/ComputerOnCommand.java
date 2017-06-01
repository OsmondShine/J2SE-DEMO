package com.xl.designpattern.command_2;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-25
 * @description 
 * @version 1.0
 */

public class ComputerOnCommand implements Command{

	private Computer computer;
	
	public ComputerOnCommand(Computer computer){
		this.computer = computer;
	}
	
	@Override
	public void execute() {
		computer.on();
	}
}

