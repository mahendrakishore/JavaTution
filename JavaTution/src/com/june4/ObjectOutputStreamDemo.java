package com.june4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.omg.Messaging.SyncScopeHelper;

public class ObjectOutputStreamDemo implements Serializable{

	String name ; int id ; transient int age ;
	ObjectOutputStreamDemo(String name , int id, int age){
		this.name = name;
		this.id = id;
		this.age = age;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ObjectOutputStreamDemo  o1 = new ObjectOutputStreamDemo("aaa",111,10);
		ObjectOutputStreamDemo  o2 = new ObjectOutputStreamDemo("bbb",222,20);
		ObjectOutputStreamDemo  o3 = new ObjectOutputStreamDemo("ccc",333,30);
		FileOutputStream fos = null;
try {
	 fos = new FileOutputStream("Emp.txt");
	ObjectOutputStream os = new ObjectOutputStream(fos);
	os.writeObject(o1);
	os.writeObject(o2);
	os.writeObject(o3);
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}finally{
	fos.close();
}

FileInputStream fis = new FileInputStream("C:\\Mahen\\git\\JavaTution\\Emp.txt");
ObjectInputStream  ois = new ObjectInputStream(fis);


try {
	ObjectOutputStreamDemo[] s = (ObjectOutputStreamDemo[])ois.readObject();
	for(int  i = 0 ; i< s.length;i++){
		System.out.println(s[i].name+" "+s[i].age+" "+s[i].id);
	}
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
finally{
	fis.close();
	ois.close();
}
}}
