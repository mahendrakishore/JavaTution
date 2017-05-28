package com.may27;

public class Square implements Drawable{

	int side ;
	
	Square(int side){
		this.side = side;
	}
	@Override
	public void cal_area() {
		// TODO Auto-generated method stub
		int area = side *side ;
		System.out.println(area+" = area of square");
				 
	}

}
