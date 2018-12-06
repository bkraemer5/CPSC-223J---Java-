/*
 * Brittany Kraemer		09/04/18
 * CPSC 223J - Professor Hamidi
 * Lab 01: Input/Output
 * This code takes in the name and age of a person and determines
 * 	his or her stage in life
 */

package damo1;

import java.util.Scanner;

public class NameAndAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a person's name:");
		String name = input.nextLine();
		// takes in a name from the user
		
		System.out.println("Please enter the person's age:");
		int age = input.nextInt();
		// takes in an age from the user
		
		if (age < 1) {
			// person is infant if age is less than 1
			System.out.println(name + " is an infant");
		}
		else if (age >= 1 && age <= 3) {
			// person is toddler if age is between 1 & 3
			System.out.println(name + " is a toddler");
		}
		else if (age >= 4 && age <= 5) {
			// person is preschooler if age is between 4 & 5
			System.out.println(name + " is a preschooler");
		}
		else if (age >= 6 && age <= 12) {
			// person is a grade schooler if age is between 6 & 12
			System.out.println(name + " is a grade schooler");
		}
		else if (age >= 13 && age <= 18) {
			// person is a teenager if age is between 13 & 18
			System.out.println(name + " is a teenager");
		}
		else if (age >= 19 && age <= 21) {
			// person is a young adult if age is between 19 and 21
			System.out.println(name + " is a young adult");
		}
		else if (age > 21) {
			// person is an adult if they are over 21
			System.out.println(name + " is an adult");
		}

	}

}

/*			OUTPUT
 * 
 * 
 * Please enter a person's name:
 * George
 * Please enter the person's age:
 * 17
 * George is a teenager
 * 
 * 
 * 
 * Please enter a person's name:
 * Katie
 * Please enter the person's age:
 * 2
 * Katie is a toddler
 * 
 */
