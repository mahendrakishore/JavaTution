package com.practice6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TakeInputFromUserMain2 {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		int arrsize ;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the array size");
		try {
			arrsize = Integer.parseInt(br.readLine());
			TakeInputFromUser[] arr = new TakeInputFromUser[arrsize];
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		TakeInputFromUser tifu = new TakeInputFromUser();
		for (int i = 0 ; i<arrsize; i++){
			try {
			tifu.getData();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
		tifu.show();
	}

}
