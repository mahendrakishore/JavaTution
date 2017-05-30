package com.may28.exceptionhandeling;

public class Test {

void validate(int age){
try{	if(age>18){
		throw new AgeNotValidException("parameterrzed");
	}
	else{
		System.out.println("u are not eligible");
	}}
catch(AgeNotValidException anve){
	System.out.println(anve);
	System.out.println("enter valid age");
}
}

void validateWeight(int w1) throws WeightNotValid{

	if(w1<40){
		throw new WeightNotValid();
	}
	else {
	System.out.println("wt is valid");	
	}
}
	
	public static void main(String[] args) throws WeightNotValid {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.validate(10);
		
		//t.validateWeight(11); need try catch block or add throws to give it to JVM but JVM will terminate the code if we have to run it 
		// then we have towrite try catch
		try {
			t.validateWeight(12);
		} catch (WeightNotValid e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	
	}

}
