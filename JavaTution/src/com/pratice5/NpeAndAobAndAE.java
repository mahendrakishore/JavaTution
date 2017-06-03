package com.pratice5;

public class NpeAndAobAndAE {

	void divison(int a , int b){
			//System.out.println(a/b);
			int[] arr = {1,2,3};
			System.out.println(arr[4]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NpeAndAobAndAE ex = new NpeAndAobAndAE();
		
		try{
			//ex.divison(10, 0);
			ex.divison(10, 10);
			}
		catch(ArithmeticException ae){
			System.out.println("dividing by zero");
		}
		catch(ArrayIndexOutOfBoundsException aob){
			System.out.println("array not in bound");
		}
	}

}
