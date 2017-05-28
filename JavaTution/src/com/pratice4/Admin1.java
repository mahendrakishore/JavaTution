package com.pratice4;

public class Admin1 extends Emp1 {

	int allowance;
	
	 Admin1(int id ,  String name , int basicsal ,int allowance ){
		 super(id, name, basicsal);
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
