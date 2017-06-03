package com.pratice5;

public class MultipleTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		  try {int a = 10, b=10 ;//b = 0;
		  int div = a/b ;
		  try{
			  int[] arr = {1,2,3};
		  System.out.println(arr[0]);
		  String s = null;
		  System.out.println(s.length());
		  }
		  catch(ArrayIndexOutOfBoundsException aob){
			  System.out.println("array index out of bound exception");
		  }
		  catch(NullPointerException npe){
			  System.out.println("null pointer exception");
		  }
	}
		  catch(ArithmeticException ae){
			  System.out.println("arithmetic exception");
		  }
		  System.out.println("end of try catch block");
	}

}
