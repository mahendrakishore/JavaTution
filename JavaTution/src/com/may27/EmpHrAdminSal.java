package com.may27;

public class EmpHrAdminSal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp e ;
		//================
		Hr hr = new Hr(1,2,3);
		hr.getData(2,8, "hr");
		e= hr;
		e.calSal();
		hr.show();
		//==============
		Admin a = new Admin(10);
		a.getData(3, 5, "admin");
		e=a;
		
		e.calSal();
        a.show();

	}

}
