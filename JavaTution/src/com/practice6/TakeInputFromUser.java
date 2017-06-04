package com.practice6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.SynchronousQueue;

public class TakeInputFromUser {

	String name ; int id,age ; float sal;
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	void getData() throws IOException{
		System.out.println("Enter name");
		name = br.readLine();
		System.out.println("Enter id");
		id = Integer.parseInt(br.readLine());
		System.out.println("Enter age");
		age = Integer.parseInt(br.readLine());
		System.out.println("Enter salary");
		sal = Float.parseFloat(br.readLine());
			}
	
	void show(){
		System.out.println("\tname:"+name+"\tid:"+id+"\tage:"+age+"\tsal:"+sal);
	}
}
