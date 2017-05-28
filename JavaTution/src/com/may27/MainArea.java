package com.may27;

public class MainArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Drawable d ;
		Circle c = new Circle(5);
		d = c ;
		d.cal_area();
		Square s = new Square(6);
		d=s;
		d.cal_area();
		Rectangle r = new Rectangle(7, 3);
		d = r ;
		r.cal_area();
	}

}
