package com.pratice4;

public class Hr1 extends Emp1{

	int bonus , daily ;

	 Hr1(int id ,  String name , int basicsal ,int bonus , int daily ){
		 super(id, name, basicsal);
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
