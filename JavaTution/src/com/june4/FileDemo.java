package com.june4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileDemo {
	
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		FileWriter fw = null;
		
		 try {
			fw = new FileWriter("C:\\Mahen\\git\\JavaTution\\Demo.txt");
			String s = "hello";
			fw.write(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
		try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}

	

	}

}
