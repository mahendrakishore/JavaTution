package com.may27;

public class Rectangle implements Drawable{
 int length , breadth;
 
 Rectangle( int length , int breadth){
	 this.length = length;
	 this.breadth = breadth;
 }
	@Override
	public void cal_area() {
		// TODO Auto-generated method stub
		int area =  length * breadth;
		System.out.println(area+" = area of rectangle");
	}

}
