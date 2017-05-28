package com.pratice;

public class IncrementOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a  = 10 , b = 20 , c = 30 ;
 int d  = a + ++b ;
 System.out.println("pre incrment value"+b);
 System.out.println(d);
 int e  = a  + c++;
 System.out.println("post incrment value"+c);
 System.out.println(e);
	}

}
