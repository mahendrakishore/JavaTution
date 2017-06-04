package com.june4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileDemo2 {
	
	
	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		FileReader fr = null;
		try {
			 fr = new FileReader("Demo.txt");
			int i ;
			 while((i=fr.read())!=-1){
				char ch = (char)i;
				 System.out.print(ch);
			 }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			fr.close();
		}
		

	}

}
