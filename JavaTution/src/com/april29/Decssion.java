package com.april29;

public class Decssion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char gender = 'm' ;
		int age = 40 ;
		String f =" female" ;
		int height= 170;
		
if (gender=='m'||gender =='M'){
	if( age>30 && height>160){
		System.out.println("recurtied male");
	}
	 else{
			 System.out.println("not recurited");
		 }
	}
 else{
			if(gender=='f'||gender =='F'){
				if(age>30 && height>160){
					System.out.println("recutied female");
				}
				else{
					System.out.println("not ere");
				}
				}
			}

	 }
}
