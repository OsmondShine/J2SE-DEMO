package com.xl.designpattern.command_2;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-25
 * @description 
 * @version 1.0
 */

public class Test {
	public static void main(String[] args) {
		Computer computer = new Computer();
		Light light = new Light();
		
		/*	ControlPanel controlPanel = new ControlPanel(new Command[]{
		new LightOnCommand(), new LightOffCommand(), new ComputerOnCommand(), new ComputerOffCommand()
	});*/
		ControlPanel controlPanel = new ControlPanel();
		
		controlPanel.setCommand(0, new ComputerOnCommand(computer));
		controlPanel.setCommand(1, new ComputerOffCommand(computer));
		controlPanel.setCommand(2, new LightOnCommand(light));
		controlPanel.setCommand(3, new LightOffCommand(light));
	
		controlPanel.keyPressed(0);
		controlPanel.keyPressed(1);
		controlPanel.keyPressed(2);
		controlPanel.keyPressed(3);
		controlPanel.keyPressed(6);
		controlPanel.keyPressed(90);
		
		System.out.println("一键搞定版");
		QuickCommand quickCommand = new QuickCommand(new Command[]{
				new LightOnCommand(light), new LightOffCommand(light), new ComputerOnCommand(computer), new ComputerOffCommand(computer)
			});
		controlPanel.setCommand(8, quickCommand);
		controlPanel.keyPressed(8);
	}
}

