package com.xl.designpattern.status;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-26
 * @description 状态接口
 * @version 1.0
 */

public interface IStatus {
	//放钱
	public void insertMoney();
	//退钱
	public void backMoney();
	//转动曲柄
	public void turnCrank();
	//出商品
	public void dispense();
}

