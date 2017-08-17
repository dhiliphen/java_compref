package com.compref_java;

//volume returns volume of a box

public class classDemo4 {

	public static void main(String[] args) {
		
		Box4 myBox1 = new Box4();
		Box4 myBox2 = new Box4();
		double vol;
		
		//instance variable - myBox1's  features
		myBox1.depth = 10.0;
		myBox1.width = 11.0;
		myBox1.height = 12.0;
		
		//instance variable - myBox2's  features
		myBox2.depth = 10.0;
		myBox2.width = 12.0;
		myBox2.height = 13.0;
		
		//get the volume of myBox1
		vol = myBox1.volume();
		System.out.println("The volume of MyBox1 is "+ vol);
		
		//get the volume of myBox2
		vol = myBox2.volume();
		System.out.println("The volume of MyBox2 is "+ vol);
		
	}

}

class Box4{
	double height;
	double width;
	double depth;
	// compute and return the v
	double volume() {
		return height*width*depth;
	}
	
}


