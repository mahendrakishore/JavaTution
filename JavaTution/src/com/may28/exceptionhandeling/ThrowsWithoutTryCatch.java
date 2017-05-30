package com.may28.exceptionhandeling;

public class ThrowsWithoutTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int  age = 10 ;

/*try{*/if(age<18){
	throw new ArithmeticException("invalid");
}
else{
	System.out.println("eligible");
} //}
/*catch(ArithmeticException ae){
	System.out.println("plz enter valid age");
}*/
	}

}
