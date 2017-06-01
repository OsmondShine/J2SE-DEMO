package com.xl.designpattern.status;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-26
 * @description 自动售货机
 * @version 1.0
 */

public class VendingMachine {
	
	private IStatus noMoneyStatus;
	private IStatus hasMoneyStatus;
	private IStatus soldStatus;
	private IStatus soldOutStatus;
	private IStatus winnerStatus;
	
	private int count = 0;
	private IStatus currentStatus = noMoneyStatus;
	
	public VendingMachine(int count){
		noMoneyStatus = new NoMoneyStatus(this);
		hasMoneyStatus = new HasMoneyStatus(this);
		soldStatus = new SoldState(this);
		soldOutStatus = new SoldOutState(this);
		winnerStatus = new WinnerStatus(this);
		
		if (count > 0){
			this.count = count;
			currentStatus = noMoneyStatus;
		}
	}
	
	public void insertMoney(){
		currentStatus.insertMoney();
	}
	
	public void backMoney(){
		currentStatus.backMoney();
	}
	
	public void turnkCrank(){
		currentStatus.turnCrank();
		if (currentStatus == soldStatus || currentStatus == winnerStatus){
			currentStatus.dispense();
		}
	} 
	
	public void dispense(){
		System.out.println("发出一件商品.....");
		if (count != 0){
			count-- ;
		}
	}
	
	public void setStatus(IStatus status){
		this.currentStatus = status;
	}

	public IStatus getHasMoneyStatus() {
		return hasMoneyStatus;
	}

	public IStatus getNoMoneyStatus() {
		return noMoneyStatus;
	}

	public int getCount() {
		return count;
	}

	public IStatus getWinnerStatus() {
		return winnerStatus;
	}

	public IStatus getSoldStatus() {
		return soldStatus;
	}

	public IStatus getSoldOutStatus() {
		return soldOutStatus;
	}

	public IStatus getCurrentStatus() {
		return currentStatus;
	}
}

