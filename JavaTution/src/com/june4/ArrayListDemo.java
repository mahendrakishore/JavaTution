package com.june4;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al  = new ArrayList<>();
		al.add("red");
		al.add("redies");
		al.add("GREEN");
		al.add("Blue");
		al.add("red");
		al.add("GREEN");
		al.add("Blue");
		System.out.println(al);
		ArrayList<String> al2 = new ArrayList<>();
		al2.add("red");
		al2.add("GREEN");
		al2.add("Blue");
		al2.add("red");
		al2.add("white");
		System.out.println(al2);
		al.addAll(al2);
		System.out.println(al);
		System.out.println(al.contains("red"));
		System.out.println(al.contains("Red"));
		//al.remove("red");
		System.out.println(al);
		//al.removeAll(al2);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		//al.clear();
		System.out.println(al);
		System.out.println(al.get(2));
		al.set(1, "RED");
		System.out.println(al);
	System.out.println(al.subList(0, 5));
	System.out.println(al.indexOf("RED"));
	System.out.println(al.lastIndexOf("red"));
	System.out.println(al.size());
	
	}

}
