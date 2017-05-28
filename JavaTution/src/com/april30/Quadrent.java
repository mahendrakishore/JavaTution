package com.april30;

public class Quadrent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x = 0 , y = -20 ;
if(x>0 && y>0){
	System.out.println("you are in 1th quadrent and the value is = "+x+" "+y);
}
else if(x<0 && y>0){
	System.out.println("you are in 2th quadrent and the value is = "+x+" "+y);
}
else if (x<0 && y<0){
	System.out.println("you are in 3th quadrent and the value is = "+x+" "+y);
}
else if(x>0 && y<0){
	  System.out.println("you are in 4th quadrent and the value is = "+x+" "+y);
}
	else {
		System.out.println("worng co ordinate selected = "+x+" "+y);
	}
}

}