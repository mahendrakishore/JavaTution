package com.pratice5;

public class ExceptionFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		try{
			int a = 10 , b=0;//b= 10;
			int div = a/b;
			String s = "aa";
			System.out.println(s);
			int[] arr = {1,2,3};
			System.out.println(arr[0]);
			System.out.println("no exception");
		}
		
		catch(ArithmeticException ae){
			System.out.println("");
		}
		catch(NullPointerException npe){
			System.out.println("NullPointerException");
		}
		catch(ArrayIndexOutOfBoundsException aob){
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch(Exception e){
			System.out.println("Exception");
		}
		finally{
			System.out.println("finally");
		}
		System.out.println("end of try catch flow");
	}

}
