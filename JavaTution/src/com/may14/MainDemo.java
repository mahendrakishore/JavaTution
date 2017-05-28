package com.may14;

public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Demo d = new Demo();
d.showData();
d.getData(10, 20);
d.showData();
d.getData(1, 2);// overriding data

Demo d1 = new Demo();
d.getData(30, 40);


Demo d2 = new Demo();
d.num1 = 33;
d.num2 = 44;
d.showData();
	}

}
