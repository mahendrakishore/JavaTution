package com.pratice;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableAndMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String,String> hm = new HashMap<String,String>();
hm.put("test", "HashMap");
System.out.println(hm);

Hashtable<String,String> ht = new Hashtable<String,String>();
ht.put("test", "Hashtable");
System.out.println(ht);
	}

}
