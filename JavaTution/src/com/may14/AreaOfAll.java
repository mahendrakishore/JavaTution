package com.may14;

public class AreaOfAll {
	
	int sqarea ;
	
	
	void area(int side){
		 int area = side*side ;
		 sqarea = area ;
		//System.out.println("area of square = "+area);
	}
	
	void area(int l , int b){
		int area = l*b ;
		System.out.println("area of rectangle = "+area);
	}
	
	void area(float radius){
		float area = 3.14f*radius*radius;
		System.out.println("area of circle = "+area);
		}
	
	void area(float a , float b){
		float area = .5f*(a*b);
		System.out.println("area of tringle ="+area);		
	}

}
