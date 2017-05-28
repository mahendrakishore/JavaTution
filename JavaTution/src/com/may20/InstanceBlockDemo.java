package com.may20;

public class InstanceBlockDemo {

	{
		System.out.println(" in instancce block");
	}
	
	InstanceBlockDemo(){
		System.out.println(" in construtor");
	}
	static {
		System.out.println( " in static ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceBlockDemo c= new InstanceBlockDemo();
		
	}

}
