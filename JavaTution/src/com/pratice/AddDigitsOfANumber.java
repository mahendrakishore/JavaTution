package com.pratice;

public class AddDigitsOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1023 ,sum =0 , rem;
while(num>0){
	rem = num%10;
	sum=sum+rem;
	num = num/10;
}
System.out.println(sum);
	}

}
