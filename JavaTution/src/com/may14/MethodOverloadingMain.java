package com.may14;

public class MethodOverloadingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading mol = new MethodOverloading();
		mol.m(20f, 30f);
	    mol.m(1f, 2f, 3f);
	    mol.m(10, 20f);// upcasting
	    mol.m(22, 11);
		
	}

}
