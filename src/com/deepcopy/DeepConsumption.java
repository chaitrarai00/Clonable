package com.deepcopy;

import com.model.Class2;
import com.model.Simpleclass;

public class DeepConsumption {

		public static void main(String[] args) throws CloneNotSupportedException {
			Class2 object=new Class2();
			object.x=10;
			object.y=20;
			Simpleclass object1=new Simpleclass();
			object1.a=100;
			object1.b=200;
			object.z=object1;
			/*
			 * Lets try cloning by assignment
			 */
			Class2 assignment_clone=object;
			/*
			 * The issue of object attributes with shallow copy
			 * is solved here since the class overrides theclone3 method to make a deep one
			 */
			Class2 cloned_obj=(Class2) object.clone();
			object.x=100;
			object.z.a=300;
			object.z.b=400;
			System.out.println("old object: "+object.x+", "+object.y+", "+object.z.a+", "+object.z.b);
			System.out.println("assigment object: "+object.x+", "+object.y+", "+object.z.a+", "+object.z.b);
			System.out.println("cloned object: "+cloned_obj.x+", "+cloned_obj.y+", "+cloned_obj.z.a+", "+cloned_obj.z.b);
		}


}
