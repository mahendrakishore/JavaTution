package com.pratice4;

public class Admin extends Emp{
	int allowance;
	
	 void getData(int allowance ){
		 this.allowance = allowance ;
	 }
	
 void calSal(){
	 int sal  = allowance + basicsal;
	 System.out.println(sal);
 }
 
 void show(){
	 super.show();
	 System.out.println("allowance = "+allowance);
 }

}
