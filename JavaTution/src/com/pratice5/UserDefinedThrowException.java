package com.pratice5;

public class UserDefinedThrowException {

	
	void ageCompare(int age) {
		
		try{if(age<50){
			throw new AgeException();
		}
		else{
			System.out.println(" valid age");
		}
		}
		catch (AgeException ae){
			System.out.println(ae);
			System.out.println("error in age");
		}
	}
	
	void weightCompare(int wt) throws WeightException{
		if(wt<50){
			throw new WeightException("weight less");
		}
		else{
			System.out.println("correct weight");
		}
		
	}
	
	public static void main(String[] args) throws WeightException {
		// TODO Auto-generated method stub
		UserDefinedThrowException ude = new UserDefinedThrowException();
		ude.ageCompare(10);
		ude.ageCompare(60);
		
		try {
			ude.weightCompare(10);
		} catch (WeightException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("try catch weight error");
		}
		
		//ude.weightCompare(20);
		//ude.weightCompare(60);
		System.out.println("with try catch");
	}

}
