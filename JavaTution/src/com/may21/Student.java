package com.may21;

public class Student {

	int id , age ;
	String name ;
	double percentage ;
	
	public String toString(){
		return id+""+name+""+percentage;
	}
	
	void takeData( int id , int age , String name ,double percentage){
		this.id= id;
		this.age=age;
	   this.name = name;
	   this.percentage = percentage ;
	}
	
	void dispaly(){
		System.out.println(id+"\\"+name+"\\"+age+"\\"+percentage);
	}
}
