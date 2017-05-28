package com.assignment27;

public class Marks extends Student {
	 int m1,m2,m3;
	
	 void getData( int m1, int m2, int m3){
		 this.m1 = m1;
		 this.m2 = m2;
		 this.m3 = m3;
	 }
	 
	 void show(){
		 super.show();
		 System.out.println("m1 , m2 , m3 are"+m1+" "+m2+" "+m3);
	 }
	 

}
