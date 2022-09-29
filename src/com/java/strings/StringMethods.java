package com.java.strings;

public class StringMethods {

	public static void main(String[] args) {
		String str="Bablu True";
		String str1="Abablu11111111";
		String str2="babluuuuu";
		// finding the length of the string
		System.out.println(str.length());
		// Adding the string 
		System.out.println(str.concat(str1+str2));
		// finding the position of the string
		System.out.println(str.charAt(2));
		// specifying the index to the end of the string i.e (substring)
		System.out.println(str.substring(1,5));
		// replace
		System.out.println(str.replace('b','d' ));
		// empty
		System.out.println(str.isEmpty());
		// tolower case (changing the case of the letter to the lower case )
		System.out.println(str.toLowerCase());
		// Toupper case
		System.out.println(str.toUpperCase());
		// conatins
		System.out.println(str.contains("BabluTrue"));
		// Compare two strings
		System.out.println(str.compareTo(str1));
				
		
		
	}

}
