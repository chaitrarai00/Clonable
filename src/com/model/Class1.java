package com.model;

public class Class1 implements Cloneable{
	public int x;
	public int y;
	
	public Simpleclass z;
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
