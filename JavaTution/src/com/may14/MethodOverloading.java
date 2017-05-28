package com.may14;

public class MethodOverloading {
	
	void m(int a , int b){
		System.out.println(a+" "+b);
		System.out.println("int and int");
	}

	void m(float a , float b){
		System.out.println(a+" "+b);
		System.out.println("float and float");
	}

	void m(float a , int b){
		System.out.println(a+" "+b);
		System.out.println("float and int");
	}
	
	void m(float a , float b , float c){
		System.out.println(a+" "+b+" "+c);
		System.out.println("float and float and float");
	}
}
