package com.april30;

public class ReverseOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num = 123 , rem ;
while(num>0){
	 rem = num%10 ;
	 System.out.println(rem);
	 num = num/10;
}
	}

}
