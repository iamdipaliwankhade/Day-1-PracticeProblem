package com.practiceproblem;

import java.util.Scanner;

/**
 * 
 * @author Dipali
 *
 */
public class StringEquality {
	public static void main(String[] args) {
		String str1, str2;

		// taking user input
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first String");
		str1 = scan.nextLine();

		System.out.println("Enter second String");
		str2 = scan.nextLine();

		// comparing two input string
		if (str1.equals(str2))
			System.out.println("Equals String");
		else {
			System.out.println("UnEquals String");
		}
	}

}
