package com.xl.designpattern.command;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-25
 * @description 
 * @version 1.0
 */

public class DoorCloseCommand implements ICommand{

	private Door door;
	
	public DoorCloseCommand(Door door){
		this.door = door;
	}
	
	@Override
	public void execute() {
		door.close();
	}

}

