package com.june3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmpMain {

	static int arrsize;
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		//Emp e = new Emp();
		System.out.println("Enter array size");
		arrsize = Integer.parseInt(br.readLine());
		Emp[] e = new Emp[arrsize];
		for(int i = 0 ; i<e.length ;i++){
			e[i] = new Emp();
			try {
				e[i].acceptData();
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		}
		
		for(int i = 0 ; i<e.length ;i++){
		if(e[i].sal>=20000 && e[i].sal<=30000){
			e[i].display();
		}
		else {
			System.out.println("salary is less");
		}
		}
		
		
		/*try {
			e.acceptData();
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		e.display();*/
	}
	

}
