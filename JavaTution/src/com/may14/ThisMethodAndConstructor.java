package com.may14;

public class ThisMethodAndConstructor {
 int a , b;
 
 /*void accept(int a , int b){
	 a= a;
	 b=b ;
 }
 */
 void accept(int a , int b){
	 this.a= a;
	 this.b=b ;
 }
 
 void show(){
	 System.out.println(a+" "+b);
 }
	
	
}
