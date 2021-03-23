package com.model;

public class Class2 implements Cloneable{


		public int x;
		public int y;
		
		public Simpleclass z;
		/*
		 * to get a deep copy
		 * on must implement the clone method of object
		 */
		public Object clone() throws CloneNotSupportedException{
			Class2 clone=(Class2) super.clone();
			clone.z.a=z.a;
			clone.z.b=z.b;
			return super.clone();
		}

}
