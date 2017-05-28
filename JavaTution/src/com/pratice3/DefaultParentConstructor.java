package com.pratice3;

import org.omg.Messaging.SyncScopeHelper;

public class DefaultParentConstructor {
	int a ;
	DefaultParentConstructor( int a ){
		this.a = a;
		System.out.println("parent constructor");
		System.out.println(a);
	}
	

}
