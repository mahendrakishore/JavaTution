package com.assignment27;

public class Result extends Marks implements SportsMarks{

	int  spmarks , total, per;
	@Override
	public void spMarks(int spmarks) {
		// TODO Auto-generated method stub
		 spmarks = spmarks;
	}
	
	void totalmarks(){
		total = m1+m2+m3+spmarks;
	}
	
	void percentage(){
		per = total/4;
	}
 void grade(){
		if(per>=70){
			System.out.println("Grade A");
		}
		else if(per>=40 || per<70 ){
			System.out.println("Grade B");
		}
		else{
			System.out.println("Grade C");
			}
	}
	
	void show(){
		super.show();
		System.out.println("total"+total+"percentage"+per);
		  grade();
		}
			
	}
