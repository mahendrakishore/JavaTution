package com.assignments28;

public class Account {
	int accountno , balance ; String name;
	
	void details(int accountno, String name,int balance){
		this.accountno = accountno;
		this.name =name;
		this.balance = balance;
	}
	
	void checkBalance() throws BalanceOutOfRange{

		if(balance<3000){
			throw new BalanceOutOfRange("Entered balanced is less than 3000");
		}
		else{
			System.out.println("balance within range");
		}
	}
	void show(){
		System.out.println("name is : "+name+", balance is = "+balance+", accountno is : "+accountno);
	}
	

}
