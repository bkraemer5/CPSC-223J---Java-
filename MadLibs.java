/*
 * Brittany Kraemer		09/04/18
 * CPSC 223J - Professor Hamidi
 * Lab 01: Input/Output
 * This code takes in user input and inserts it into a mad lib
 */

package damo2;

import javax.swing.JOptionPane;

public class MadLibs {
	
	public static void main(String[] args) {
		
		String noun1, adj1, adj2, verb1, numString;
		// strings for noun, adjectives, and verbs
		int num1;
		// number
		
		noun1 = JOptionPane.showInputDialog(null, "Enter a noun", "MAD LIB", JOptionPane.INFORMATION_MESSAGE);
		adj1 = JOptionPane.showInputDialog(null, "Enter the first adjective", "MAD LIB", JOptionPane.INFORMATION_MESSAGE);
		verb1 = JOptionPane.showInputDialog(null, "Enter a verb (past-tense)", "MAD LIB", JOptionPane.INFORMATION_MESSAGE);
		adj2 = JOptionPane.showInputDialog(null, "Enter the second adjective", "MAD LIB", JOptionPane.INFORMATION_MESSAGE);
		numString = JOptionPane.showInputDialog(null, "Enter a number", "MAD LIB", JOptionPane.INFORMATION_MESSAGE);
		
		// collects data from user
		
		num1 = Integer.parseInt(numString);
		// conversion to int
		
		JOptionPane.showMessageDialog(null, "The " + noun1 + " went to the beach with their " + adj1 + " friend." + 
				"\n" + noun1 + " " + verb1 + " and enjoyed the ocean breeze." + 
				"\nWhen " + noun1 + " returned home, they collected " + num1 + " " + adj2 + " shells" );
		// incorporates user input into message statement
		
	}

}

