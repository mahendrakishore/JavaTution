package com.may28.exceptionhandeling;

public class ThrowsWithTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int  age = 10 ;

if(age<18){
	throw new ArithmeticException();
}
else{
	System.out.println("eligible");
}
	}

}
