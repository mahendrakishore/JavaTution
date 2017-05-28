package com.may13;

public class ArrayEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a = {5,6,7,8,8}; int sumeven = 0 , sumodd = 0 ;

for(int i = a.length-1;i>=0;i--){
	int x = a[i];
	System.out.println(x);
	if(x%2==0){
		sumeven = sumeven+x ;
		
	}
	else {
		sumodd = sumodd + x;
		
	}
}
System.out.println(sumeven);
System.out.println(sumodd);
	}

}
