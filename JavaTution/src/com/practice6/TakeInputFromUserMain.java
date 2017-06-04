package com.practice6;

import java.io.IOException;

public class TakeInputFromUserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TakeInputFromUser tifu = new TakeInputFromUser();
		try {
			tifu.getData();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tifu.show();
	}

}
