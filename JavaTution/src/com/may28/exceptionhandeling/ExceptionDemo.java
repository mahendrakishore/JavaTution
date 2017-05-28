package com.may28.exceptionhandeling;

public class ExceptionDemo {

	public static void main(String[] args) {
		int a = 10 , b = 0 ;
		try{int div = a/b;
      System.out.println(div);
   /*   int[] arr = {1,2,3};
		System.out.println(arr[5])*/;}
		catch(ArithmeticException ae ){
			System.out.println("b cannot be 0");
		}
		System.out.println("end of try catch");
		
	} 
	
}
