/*
 * Brittany Kraemer		09/04/18
 * CPSC 223J - Professor Hamidi
 * Lab 01: Input/Output
 * This code determines whether or not a year is a leap year using
 * 	if statements and mods
 */

package damo1;

import java.util.Scanner;

class CtoJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a year:");
		int year = scan.nextInt();
		// takes in a year inputed by user
		
		if (year % 4 == 0) {
			// checks if divisible by four
			if (year % 100 == 0) {
				//checks if divisible by 100
				if (year % 400 == 0) {
					// checks if divisible by 400
					System.out.println(year + " is a leap year");
				}
				else
					System.out.println(year + " is not a leap year");
			}
			else
				System.out.println(year + " is a leap year");
		}
		else
			System.out.println(year + " is not a leap year");
	}

}

/* 		OUTPUT
 * 
 * Enter a year:
 * 1932
 * 1932 is a leap year
 * 
 * 
 * Enter a year:
 * 2018
 * 2018 is not a leap year
 * 
 */

