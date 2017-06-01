package com.xl.designpattern.command;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-25
 * @description 
 * @version 1.0
 */

public class LightOffCommand implements ICommand{
	
	private Light light;
	
	public LightOffCommand(Light light){
		this.light = light;
	}
	@Override
	public void execute() {
		light.off();
	}
}

