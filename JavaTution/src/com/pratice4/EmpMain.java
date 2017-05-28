package com.pratice4;

public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e ;
		/*= new Emp();
		e.getData(1,"parent", 10000);
		e.calSal();
		e.show();
		//==========================
		Emp e ;*/
		Hr hr = new Hr();
		hr.getData(10, 5);
		hr.getData(2, "hr",5000);
		//e.getData(2, "parent from hr", 5000);
		e = hr ;
		e.show();
		e.calSal();
		
		//==========================
	//	Emp e2;
		Admin a = new Admin();
		a.getData(8000);
		a.getData(3, "admin", 7000);
		e=a;
		e.show();
		e.calSal();
		
	}

}
