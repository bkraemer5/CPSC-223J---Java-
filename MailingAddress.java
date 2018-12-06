/*
 * Brittany Kraemer		09/04/18
 * CPSC 223J - Professor Hamidi
 * Lab 01: Input/Output
 * This code asks the user for their address information seperately and combines
 * 	them in address format
 */

package damo1;

import java.util.Scanner;

public class MailingAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your street");
		String street = input.nextLine();
		System.out.println("Enter the house or apartment number:");
		int number = input.nextInt();
		input.nextLine();
		System.out.println("Enter the city:");
		String city = input.nextLine();
		System.out.println("Enter the zip code:");
		int zip = input.nextInt();
		input.nextLine();
		System.out.println("Enter the State:");
		String state = input.nextLine();
		
		System.out.println(number + " " + street + ", " + city + ", " + state + " " + zip);
	}

}

/* 		OUTPUT
 * 
 * Enter your street
 * Titan Drive
 * Enter the house or apartment number:
 * 800
 * Enter the city:
 * Fullerton
 * Enter the zip code:
 * 92834
 * Enter the State:
 * CA
 * 800 Titan Drive, Fullerton, CA 92834
 * 
 * 
 */