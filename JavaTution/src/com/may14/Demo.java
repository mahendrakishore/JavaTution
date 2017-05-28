package com.may14;

public class Demo {

int num1 , num2 ; // instance variable 

void getData(int a , int b){
	System.out.println("value of local a"+a+"value of local b"+b);
	num1 = a;/// assigning local variable to instancce variable which are accessable in whole class
	num2 = b;}

void showData(){
	System.out.println("num1 value"+num1);
	System.out.println("num2 value"+num2);
}

}
