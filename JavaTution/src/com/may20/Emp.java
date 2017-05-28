package com.may20;

public class Emp {
	int id, age;
	String name ;
static 	int count ;
static String cname = "java";

Emp(){ // for blank constructor
	count++;
}
	
	Emp(int id, int age,String name){
		this.id=id;
		this.age = age;
		this.name = name;
		count++;
	}
	
	static void print(){
		System.out.println(cname);
	}
	 void takedata(int id , int age , String name)
	 {
		 this.id = id;
		 this.age = age;
		 this.name = name ;
	 }
	void show(){
		System.out.println(name+" "+id+" "+age+""+cname+" "+count);
	}
}
