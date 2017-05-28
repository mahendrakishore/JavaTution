package com.pratice;

public class ZeroEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
int num = 1023 , rem , zero = 0 , even = 0 , odd =0;

while(num>0){
	rem = num%10;
	if(rem==0){
		zero++;
	}
	else if (rem%2==0){
		even++;
	}
	else{
		odd++;
	}
	num=num/10;
}
System.out.println(zero);
System.out.println(even);
System.out.println(odd);
	
	}
}
