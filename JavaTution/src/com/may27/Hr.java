package com.may27;

public class Hr  extends Emp {
	
	int incentive , extra_hrs ,pay_per_hrs , hrsal ;
	
	Hr(int incentive , int extra_hrs , int pay_per_hrs ){
		//super( id ,  basic_sal , name);
		this.incentive = incentive;
		this.extra_hrs = extra_hrs ;
		this.pay_per_hrs = pay_per_hrs ;	}
	
/*	(int incentive , int extra_hrs , int pay_per_hrs ){
		//super( id ,  basic_sal , name);
		this.incentive = incentive;
		this.extra_hrs = extra_hrs ;
		this.pay_per_hrs = pay_per_hrs ;
		*/

      void  calSal(){
		
    	 hrsal = basic_sal +incentive+extra_hrs *pay_per_hrs;
   	
	
	}
      void show(){
    	  super.show();
    	  System.out.println("hrsal"+hrsal);
    	 
      }
	
	
}
