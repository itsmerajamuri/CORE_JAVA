package com.java.strings;

public class String1 {

	public static void main(String[] args) {
		//using string literals
		String obj="bablu";
		//int a= obj.length();
		System.out.println(obj.length());
		// position of character
		System.out.println(obj.indexOf("l"));
		//using new keyword
		String obj1=new String("bablu1 bandagonda");
		System.out.println(		obj1.length());
		System.out.println(obj1.indexOf("bandagonda"));
		

	}

}
