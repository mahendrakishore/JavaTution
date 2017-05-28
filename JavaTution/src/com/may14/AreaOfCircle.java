package com.may14;

public class AreaOfCircle {

	float area ; int radius ;
	
	void radiusOfCircle(int r){
		radius = r;
	}
	
	float areaOfCirlce(){
		area = 3.14f*radius*radius ;
		return area;
	}
}
