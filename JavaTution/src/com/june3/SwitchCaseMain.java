package com.june3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchCaseMain {

	static int searchid;
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
		
		int ch ;
		System.out.println("Enter choice 1. to display 2.salary range 3.id 4.exit");
		ch = Integer.parseInt(br.readLine());
		do {
		switch(ch){
		case 1 : 
		 for(int i = 0 ; i<e.length;i++){
			 e[i].display();
		 } break;
		
		case 2 : 
			for(int i = 0 ; i<e.length ;i++){
				if(e[i].sal>=20000 && e[i].sal<=30000){
					e[i].display();
				}} break;
				
			case 3 : 
				System.out.println("Enter the id you want to search");
				searchid = Integer.parseInt(br.readLine());
				int flag = 0;
				for(int i = 0 ; i<e.length ;i++){
				if(e[i].id==searchid){
					System.out.println("match found");
					e[i].display();
					flag ++;
					break;
				}
				}
				if(flag==0){
					System.out.println("no match found");
				} break;
		
			case 4 : 
				break;
				
				default: 
					System.out.println("worng id");
				break;
		}}
		while(ch!=4);
	}	

}
