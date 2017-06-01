package com.xl.basic;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-4
 * @description 重新定义枚举顺序值
 * @version 1.0
 */

public enum EnumTest_03 {
	MON(1), TUE(2), WED(3), THU(4), FRI(5), SAT(6){
		@Override
		public boolean isReset(){
			return true;
		}
	},
	SUN(0){
		@Override
		public boolean isReset(){
			return true;
		}
	};
	
	private int value;
	
	private EnumTest_03(int value){
		this.value = value;
	}
	public int getValue(){
		return value;
	}
	
	public boolean isReset(){
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println("EnumTest.FRI的 value = " + EnumTest_03.FRI.getValue());
	}
}

