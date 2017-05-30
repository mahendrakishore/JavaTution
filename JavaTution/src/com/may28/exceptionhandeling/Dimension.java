package com.may28.exceptionhandeling;

public class Dimension {
	
	void div(int a , int b) throws ArithmeticException,ArrayIndexOutOfBoundsException{
		int div = a/b;
		System.out.println(div);
		int[] arr = {1,2,3};
		System.out.println(arr[11]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {Dimension d = new Dimension();
	//	d.div(10, 0);
		d.div(10, 10);}
		catch(Exception e){
			System.out.println("div method not working");
		}
		
	}

}
