package com.may20;

public class MehodInMethod {

	String name ;
	
	public  void accpet(){
		System.out.println("accepet");
	}
	
	public void show(){
		System.out.println("show");
		accpet();
	}

}
