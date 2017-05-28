package com.may21;

public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Admin a = new Admin();
		a.getEmp1Details(2, 999l, "amit");
		a.getPerson1Details(22, 2023.3);
		a.getAdminDetails(30);
		//double d = a.calSal();
		a.calSal();
		a.show();
	}

}
