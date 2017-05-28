package com.pratice;

public class Pratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char gender = 'n'; int age = 25 ,height = 187;
if(gender=='m'||gender=='M'){
	if(age>30 && height>160){
		System.out.println("recutied male");
	}
	else if(age<30 && height>167){
		System.out.println("recutier with condition");
	}
	
}
else if(gender=='f'||gender=='F'){
		if(age>30 && height>160){
			System.out.println("recutied male");
		}
		else if(age<30 && height>167){
			System.out.println("recutier with condition");
		}
		else{
			System.out.println("no gender");
		}
}

	else{
		System.out.println("no gender found");
		}
	}
}