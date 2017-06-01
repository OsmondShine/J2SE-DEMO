package com.xl.designpattern.command_2;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-25
 * @description 
 * @version 1.0
 */

public class ComputerOffCommand implements Command{

	private Computer computer;
	
	public ComputerOffCommand(Computer computer){
		this.computer = computer;
	}
	
	@Override
	public void execute() {
		computer.off();
	}
}

