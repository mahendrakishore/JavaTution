package com.pratice;

public class DoWhile {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int i = 1 , sum = 0;
do{
	if(i%2!=0){
	sum =sum+i;
	}
	i++;
}
while(i<=100);
System.out.println(sum);
	}

}
