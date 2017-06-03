package com.may28.exceptionhandeling;

public class ThrowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{int  age = 10 ;

if(age<18){
	throw new ArithmeticException();
}
else{
	System.out.println("eligible");
} }
		catch(Exception e ){
			System.out.println("error caught");
		}
	}

}
