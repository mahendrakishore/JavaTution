package com.may7;

public class Table1To10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num = 1 , table ;
do{
	for(int i = 1 ; i<=10; i++){
	table = num * i;
	System.out.println("table  of"+num+" * "+i+" is = "+table);	}
	num++;
}
while(num<=10);
	}
	
}
