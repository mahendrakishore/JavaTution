package com.assignments28;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account();
		
		//acc.details(111, "aaa",2500);
		acc.details(111, "aaa",3500);
		try {
			acc.checkBalance();
		} catch (BalanceOutOfRange e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Enter more amount");
		}
		acc.show();
	}

}
