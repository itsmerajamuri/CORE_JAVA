package com.java.looping;

public class InnerWhileLoop {

	public static void main(String[] args) {
		// inner while loop
		int a=5;
		int b=6;
		while(a>1) {
			a--;
			System.out.println(a);
			while(b>1) {
				b--;
				System.out.println(b);
			}
		}

	}

}
