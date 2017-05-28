package com.pratice4;

public class Hr extends Emp {
	
	int bonus , daily ;

	 void getData(int bonus , int daily ){
		 this.bonus = bonus;
		 this.daily = daily ;
	 }
	
 void calSal(){
   int  sal = basicsal+bonus*daily;
	 System.out.println(sal);
 }
 
 void show(){
	 super.show();
	 System.out.println("bonous = "+bonus+"daily = "+daily);
 }
	
	
}
