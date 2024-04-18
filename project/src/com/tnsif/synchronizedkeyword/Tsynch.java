package com.tnsif.synchronizedkeyword;

public class Tsynch {
public static void main(String[] args) {
	Example ex=new Example(); //object
	
	T t1=new T(ex);
	T t2=new T(ex); //new state
	T t3=new T(ex);
	
	t1.start();   //runnable state
	
	t2.start();
	
	t3.start();
	
}
}
