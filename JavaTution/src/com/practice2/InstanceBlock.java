package com.practice2;

public class InstanceBlock {


	InstanceBlock(){
		System.out.println("construcotr will be call once the object is created and after instance block");
	}
	{
		System.out.println("instance block will be called after object is created and before constructor");
	}

	static{
		System.out.println("static block will be only if there is main method in the same class or object os created in other classs main method");
	}

	void instanceMethod(){
		System.out.println("will be printed only once the object is created and after constrotor");
	}

	public static void main(String[] args) {
	}


}
