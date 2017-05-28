package com.may27;

public class Circle implements Drawable {

	int rad ;
	Circle(int rad){
		this.rad = rad;
	}
	
	
	@Override
	public 	 void cal_area() {
		// TODO Auto-generated method stub
		
		 float area = pi*rad*rad;
		System.out.println(area+" = are of circle");
	}
	
	

}
