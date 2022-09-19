package com.practiceproblem;

import java.util.Scanner;

/**
 * 
 * @author Dipali
 *
 */
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		int year = sc.nextInt();
		
		if(year%400==0||year%4==0 && year%100!=0)
		{
			System.out.println(year+" is Leap year");
		}
			else {
				System.out.println(year+"is not Leap year");
		}
	}
	}


