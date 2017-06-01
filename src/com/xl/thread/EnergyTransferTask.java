package com.xl.thread;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-4-14
 * @description 
 * @version 1.0
 */

public class EnergyTransferTask implements Runnable{
	
	//共享的能量世界
	private EnergySystem energySystem;
	//能量源盒子下标
	private int fromBox;
	//单次能量转移最大单元
	private double maxAmount;
	//最大休眠时间(毫秒)
	private int DELAY = 10;
	
	/**
	 * @param energySystem
	 * @param fromBox
	 * @param maxAmount
	 */
	public EnergyTransferTask(EnergySystem energySystem, int fromBox, double maxAmount) {
		this.energySystem = energySystem;
		this.fromBox = fromBox;
		this.maxAmount = maxAmount;
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		try {
			while (true){
				int toBox = (int) (energySystem.getBoxAmount()*Math.random());
				double amount = maxAmount * Math.random();
				energySystem.transfer(fromBox, toBox, amount);
				Thread.sleep((int)(DELAY * Math.random()));
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

