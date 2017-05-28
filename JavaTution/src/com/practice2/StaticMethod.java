package com.practice2;

public class StaticMethod {
	
	int id ; static int roll =10 ; static String ss = "not matiching os ";
	
	static{
		String name = System.getenv("OS");
		System.out.println(name); //Windows_NT
		if(name.equals("Windows_NT")){
			System.out.println("you can procced");
		}
		else{
			System.out.println("you cannot proceed");
			System.exit(0);
		}
	}
	
	 void getData( int roll){
		StaticMethod.roll = roll;
	}
	 
	
	
	
	static void show(){
		//System.out.println(id);
		System.out.println(roll);
	}
	

}
