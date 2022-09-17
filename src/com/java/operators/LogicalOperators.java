package com.java.operators;

public class LogicalOperators {

	public static void main(String[] args) {
		// && (and)
		int a=10;
		int b=10;
		
				if(a>=b && a<=b) {
					System.out.println("true");
				}
				else {
					System.out.println("false");
				}
		// || (or)
				
				if(a>b || a<b) {
					System.out.println("true");
				}
				else {
					System.out.println("false");
				}
	   // logical not (!)
				if(!(a>=b)) {
					System.out.println("true");
				}
				else {
					System.out.println("false");
				}
				

	}

}
