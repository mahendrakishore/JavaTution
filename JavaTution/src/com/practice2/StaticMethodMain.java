package com.practice2;

public class StaticMethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethod.roll = 20;
		StaticMethod sm = new StaticMethod();
		sm.getData(30);
		//StaticMethod.getData(30);
		StaticMethod.show();
	}

}
