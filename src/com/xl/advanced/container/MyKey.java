package com.xl.advanced.container;

public class MyKey implements Comparable{
	private final int id;
	
	public MyKey(int id) {
		super();
		this.id = id;
	}
	
	public int getId(){
		return this.id;
	}


	@Override
	public int compareTo(Object o) {
		return this.id - ((MyKey)o).id;
	}
	@Override
	public boolean equals(Object o){
		return (o instanceof MyKey) && (this.id == ((MyKey)o).id);
	}
	@Override
	public int hashCode(){
		return new Integer(id).hashCode();
	}
}
