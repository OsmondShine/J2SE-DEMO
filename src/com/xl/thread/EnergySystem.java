package com.xl.thread;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-4-14
 * @description 
 * @version 1.0
 */
/* 宇宙的能量系统
 * 遵循能量守恒定律
 * 能量不会凭空创生或消失，只会从一处转移到另一处
 */
public class EnergySystem {
	//能量盒子，能量存储的地方
	private final double[] energyBoxes;
	private final Object lockObj = new Object();
	
	/**@param n	能量盒子的数量
	 * @param initialEnergy	每个盒子含有的初始能量
	 */
	public EnergySystem(int n, double initialEnergy) {
		this.energyBoxes = new double[n];
		for (int i = 0; i < energyBoxes.length; i++){
			energyBoxes[i] = initialEnergy;
		}
	}
	
	/* 能量的转移，从一个盒子到另一个盒子
	 * @param from 能量源
	 * @param to   能量输送终点
	 * @param amount	能量值 
	 * */
	public void transfer(int from, int to, double amount){
		
		synchronized (lockObj) {
			//while循环,保证条件不满足时任务都会被阻挡，而不是继续竞争CPU资源
			while(energyBoxes[from] < amount){
				try {
					lockObj.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			System.out.print(Thread.currentThread().getName());
			energyBoxes[from] -= amount;
			System.out.printf("从%d转移%10.2f单位能量到%d", from, amount, to);
			energyBoxes[to] += amount;
			System.out.printf("\t能量总和：%10.2f%n", getTotalEnergies());
			//唤醒所有在lockObj对象上等待的线程
			lockObj.notifyAll();
		}
		
	}

	/**
	 *  获取能量总和
	 */
	private double getTotalEnergies() {
		double sum = 0;
		for (double amount: energyBoxes){
			sum += amount;
		}
		return sum;
	}
	/*返回能量盒子的长度*/
	public int getBoxAmount(){
		return energyBoxes.length;
	}
}

