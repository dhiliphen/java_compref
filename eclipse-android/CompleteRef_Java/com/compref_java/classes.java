package com.compref_java;

public class classes{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box firstclass = new Box();
		Box secondclass = new Box(); 										
		double vol;
		
		firstclass.depth = 20.5;
		firstclass.height = 18.5;
		firstclass.width = 1;
		
		secondclass.depth = 20.5;
		secondclass.height = 18.5;
		secondclass.width = 2.0;

		
		vol = firstclass.depth*firstclass.height*firstclass.width;
		
		System.out.println("The volume of first class is "+vol);
		
		vol = secondclass.depth*secondclass.height*secondclass.width;
		
		System.out.println("The volume of second class is "+vol);
	
	}
	
}
class Box{
	double width;
	double height;
	double depth;
}
