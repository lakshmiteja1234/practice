package com.wipro.flowcontrolstatements;

public class Ex7 {

	public static void main(String[] args) {
		char ch = 'H';
		
		if (Character.isLowerCase(ch)) 
			System.out.println(ch + "->" + Character.toUpperCase(ch));
		else
			System.out.println(ch + "->" + Character.toLowerCase(ch));

	}



}
