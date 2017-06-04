package com.june4;

import java.util.Scanner;

public class Factorial {
	
	
	
public static void main(String[] args) {
	int num , fact =1 ;
	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter the number ");
	num = s.nextInt();
	
	while(num>=1){
		fact = fact * num;
		num--;
				}
	System.out.println(fact);
}
	
	

}
