package com.pratice4;

public class Emp {
	 int id , basicsal ; String name ;
	 
	 void getData(int id ,  String name , int basicsal ){
		 this.id = id;
		 this.name = name;
		 this.basicsal = basicsal;
	 }
	
 void calSal(){
	 System.out.println("in emp class");
 }
 
 void show(){
	 System.out.println("emp id is = "+id+" emp name is : "+name+" basic salary = "+basicsal);
 }
 
}
