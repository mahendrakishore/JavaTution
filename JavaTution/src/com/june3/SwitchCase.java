package com.june3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchCase {

int id , age ; double sal ;String name ;
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		
void acceptData() throws NumberFormatException, IOException {
	System.out.println("enter id");
id = Integer.parseInt(br.readLine());
System.out.println("Enter age");
age = Integer.parseInt(br.readLine());
System.out.println("enter salary");
sal = Double.parseDouble(br.readLine());
System.out.println("Enter name");
name = br.readLine();
}

void display(){
	System.out.println("id = "+id+", name = "+name+", age = "+age+", sal = "+sal);
}
}
