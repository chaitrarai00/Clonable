package com.shallowcopy;

import com.model.Class1;
import com.model.Simpleclass;

public class ShallowConsumption {

	public static void main(String[] args) throws CloneNotSupportedException {
		Class1 object=new Class1();
		object.x=10;
		object.y=20;
		Simpleclass object1=new Simpleclass();
		object1.a=100;
		object1.b=200;
		object.z=object1;
		/*
		 * Lets try cloning by assignment
		 */
		Class1 assignment_clone=object;
		/*
		 * it creates a clone but the object attributes 
		 * do not change since they copy the reference on clone
		 * but not the copy of object
		 * hence the original object and the cloned object
		 * both would refer to the same object
		 */
		Class1 cloned_obj=(Class1) object.clone();
		object.x=100;
		object.z.a=300;
		object.z.b=400;
		System.out.println("old object: "+object.x+", "+object.y+", "+object.z.a+", "+object.z.b);
		System.out.println("assigment object: "+object.x+", "+object.y+", "+object.z.a+", "+object.z.b);
		System.out.println("cloned object: "+cloned_obj.x+", "+cloned_obj.y+", "+cloned_obj.z.a+", "+cloned_obj.z.b);
	}

}
