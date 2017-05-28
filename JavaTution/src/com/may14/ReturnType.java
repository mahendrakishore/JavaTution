package com.may14;

public class ReturnType {
	
	int num1 , num2 , sum ;
	
	void accept (int a , int b ){
		num1 = a ;
		num2 = b;
	}
 int add(){
	 sum = num1+num2;
	  return sum;
 }
}
