package com.june4;

import java.io.File;
import java.io.IOException;

public class FileClassDemo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		//File f = new File("MyFile.txt");
		File f  = new File("C:\\Mahen\\git\\JavaTution");
		System.out.println(f.exists());
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(f.exists());
		System.out.println(f.canWrite());
		System.out.println(f.canWrite());
		if(f.isFile()){
			System.out.println("this is file");
		}
		else{
			System.out.println("this id directory");
			String[] filenames = f.list();
			for(String temp: filenames){
				System.out.println(temp);
			}
		}
	}

}
