package com.xl.designpattern.facade;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-26
 * @description 外观模式（将常用的一系列操作封装成一个方法），很简单，就简略的写了   
 * @version 1.0
 */

public class HomeTheaterFacade {
	private Computer computer;
	private Player player;
	private Light light;
	private Projector projector;
	private PopcornPopper popper;
	/**
	 * @param computer
	 * @param player
	 * @param light
	 * @param projector
	 * @param popper
	 */
	public HomeTheaterFacade(Computer computer, Player player, Light light,
			Projector projector, PopcornPopper popper) {
		super();
		this.computer = computer;
		this.player = player;
		this.light = light;
		this.projector = projector;
		this.popper = popper;
	}
	
	public void watchMovie(){
        /** 
         *  1、打开爆米花机 
            2、制作爆米花 
            3、将灯光调暗 
            4、打开投影仪 
            5、放下投影仪投影区 
            6、打开电脑 
            7、打开播放器 
            8、将播放器音调设为环绕立体声 
         */  
		popper.on();
		popper.makePopcorn();
		light.down();
		projector.open();
		computer.on();
		play.on();
		player.make3DListener();
	}
	
	 public void stopMovie()  
	    {  
	        popper.off();  
	        popper.stopMakePopcorn();  
	        light.up();  
	        projector.close();  
	        projector.off();  
	        player.off();  
	        computer.off();  
	    }  
}

