package com.may28.exceptionhandeling;

public class AgeNotValidException extends Exception {

	AgeNotValidException(){
		System.out.println("age not valid");
	}
	AgeNotValidException(String msg ){
		System.out.println();
	}
	
}
