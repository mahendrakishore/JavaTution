package com.pratice5;

public class ThrowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int age = 30 ;
		 
		 if(age<50){
			 throw new ArithmeticException("age is less");
		 }
		 else{
			 System.out.println("valid age");
		 }
	}

}
