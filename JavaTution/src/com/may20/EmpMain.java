package com.may20;

public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Emp e1 = new Emp(1,25,"amit");
		e1.show();*/
		Emp.print();
		Emp e1 = new Emp(0,26,"amit1");
		e1.show();
		Emp e2 = new Emp(2,30,"Boy");
		e2.show();
		Emp e3 = new Emp();// for take data method
		e3.takedata(3, 35, "chot");
		e3.show();
		System.out.println(Emp.cname+Emp.count);
	}

}
