package com.may20;

public class StaticBlock {
	
/*	static{
		System.out.println("In static block 1");
	}
	
	static {
		System.out.println("In static block 2");
	}
*/
	static {
		//System.out.println(System.getenv("OS")); Windows_NT
		String osname = System.getenv("OS");
		if(osname.equals("Windows_NT1"))
		{
			System.out.println("you can process");
		}
		else {
			System.out.println("you cannot process");
			System.exit(0);	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("in main");
	}

}
