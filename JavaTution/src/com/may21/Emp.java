package com.may21;

public class Emp extends Person{
	
	int eid ;
	double esal ;

	 void acceptData(int eid, double esal) {
			this.eid = eid;
		this.esal = esal;
	}
	
	void show(){
		System.out.println(eid);
		System.out.println(esal);
		System.out.println(age);
		System.out.println(contactno);
		System.out.println(name);
	}



	}

