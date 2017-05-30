package com.may28.exceptionhandeling;

public class WeightNotValid extends Exception{
	
	WeightNotValid(){
		System.out.println("not valid wait");
	}

	WeightNotValid(String msg){
		System.out.println(msg);
	}
}
