package com.java.conditionalstatements;

public class NestedIf {

	public static void main(String[] args) {
		int a=2;
		int b=3;
		if(a==b) {
			System.out.println("both are equal");
		}
		else if(a>b) {
			System.out.println("a greater than b");
		}else if(a<b) {
			System.out.println("a less than b");
		}else {
			System.out.println("false");
		}

	}

}
