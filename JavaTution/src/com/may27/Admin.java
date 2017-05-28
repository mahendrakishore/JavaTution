package com.may27;

public class Admin extends Emp{

	int allowance , adminsal;
	Admin (int allowance){
		//super( id ,  basic_sal , name);
		this.allowance = allowance;
	}
	
	
	void  calSal(){
		adminsal = basic_sal +allowance ;		
		
	}
	
	void show(){
		super.show();
		 System.out.println("adminsal"+adminsal);
	}
}
