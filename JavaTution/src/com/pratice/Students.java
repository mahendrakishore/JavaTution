package com.pratice;

public class Students {

	String name;
	int age ;
	double marks;
	
	Students(String name , int age , double marks){
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	
	public void showName(){
		System.out.println("name is "+name+"age is "+age+"and marks is "+marks);
	}
	
	public void grade(){
		if(marks>=70){
			System.out.println(name+" grade is grade A");
		}
		else if(marks>=40 && marks<70) {
			System.out.println(name+"grade is B");
		}
		else{
			System.out.println(name+"grade is C");
		}
	}
	
}
