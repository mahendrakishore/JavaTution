package com.pratice3;

public class DefaultChildConstructor extends DefaultParentConstructor{
int b ;
	DefaultChildConstructor(int b){
		super(b);
		System.out.println("child constructor");
	}
}
