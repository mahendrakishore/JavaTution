package com.may14;

public class ReturnTypeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnType rt = new ReturnType();
		rt.accept(10, 20);
		System.out.println(rt.add());
		int x = rt.add();
		System.out.println(x);
	}

}
