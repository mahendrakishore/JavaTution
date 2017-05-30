package com.may28.exceptionhandeling;

public class Exceptiond {


		public static void main(String[] args) {
			int a = 10 , b = 0 ;
			try{int div = a/b;
	      System.out.println(div);
	   int[] arr = {1,2,3};
			System.out.println(arr[2]);
			String s = null;
			System.out.println(s.length());
			}
			catch(ArithmeticException ae ){
				System.out.println("b cannot be 0");
			}
			catch(ArrayIndexOutOfBoundsException aob){
				System.out.println("arry exectiopn");
			}
			catch(Exception e){
				System.out.println(e);
			}
			System.out.println("end of try catch");
		} 
	}


