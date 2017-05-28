package com.april29;

public class LargestNestedIfelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a= 100, b=20,c=10;

if(a>b){
	if(a>c){
		System.out.println("a is greater");
	}
	else{
		System.out.println("c is greater");
	}
}
else{
	 if(b>c){
		System.out.println("b is greater");
	}
	 else{
		 System.out.println("c is greater");
	 }
}

	}

}
