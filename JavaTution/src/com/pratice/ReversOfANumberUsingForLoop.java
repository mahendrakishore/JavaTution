package com.pratice;

public class ReversOfANumberUsingForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num = 123 , rem;
		for (int i = num;i>0;){
			rem = i%10;
			System.out.println(rem);
			 i = i/10;
		}
	}

}
