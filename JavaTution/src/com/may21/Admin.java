package com.may21;

public class Admin extends Person1 {

	double allowance , totalsal ;
	
	void getAdminDetails(double allowance){
		 this.allowance = allowance;
	}
	
	void calSal(){
		allowance = sal +	allowance ;
	//System.out.println(totalsal);
	}
	
	void show(){
			System.out.println(allowance);
		
	}
}
