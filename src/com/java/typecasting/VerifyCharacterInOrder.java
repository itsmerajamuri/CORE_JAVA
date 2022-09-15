package com.java.typecasting;

public class VerifyCharacterInOrder {

	public static void main(String[] args) {
		char a='a';
		char b='b';
		int c= Character.compare(a, b);
		if(c>0) {
			System.out.println("it is in correct order");
		}
		else {
			System.out.println("it is not in correct order");
		}
		

	}

}
