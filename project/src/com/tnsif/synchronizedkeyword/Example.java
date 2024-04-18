package com.tnsif.synchronizedkeyword;
// synchronized demo


public class Example {
 
	synchronized static void display() {
        Thread g=Thread.currentThread();
        
        for(int i=0;i<3;i++) {
        	try {
        		Thread.sleep(1000);
        		System.out.println(g.getName()+" "+i);
        	    System.out.println("---------");
        	}
        	catch(Exception e) {
        }
	}
  }
}
