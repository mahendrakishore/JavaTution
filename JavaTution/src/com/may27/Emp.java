package com.may27;

public abstract class Emp {
	
	int id , basic_sal ; 
	String name ;

	
	public void getData(int id , int basic_sal ,String name ){
		this.id = id;
		this.basic_sal = basic_sal ;
		this.name = name ;
	}
	
	abstract void  calSal();/*{
		System.out.println("in emp");
	}*/
	
	void show(){
		 System.out.println(id+"and"+name+"and"+basic_sal);
	}
	

}
