/*
 * Brittany Kraemer		09/11/18
 * CPSC 223J - Professor Hamidi
 * Lab 03: Flow Control
 * This code asks the user if they would like to play the game and continues to roll die until they press no
 */


package damo2;

import javax.swing.JOptionPane;
/*
public class Dice {

	
	public static void main(String[] args) {
		
		int selection;
		int round = 1;
		boolean isYes;
		int roll1, roll2, roll3;
		
		selection = JOptionPane.showConfirmDialog(null, "Would you like to play the dice rolling game?", "Dice Game Begin " + round,
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		isYes = (selection == JOptionPane.YES_OPTION);
		
		while (isYes) {
			
			round++;
			roll1 = (int)(Math.random() * 6) + 1;
			roll2 = (int)(Math.random() * 6) + 1;
			roll3 = (int)(Math.random() * 6) + 1;	
		
		
			JOptionPane.showMessageDialog(null, "Dice 1: " + roll1 + "\nDice 2: " + roll2 + "\nDice 3: " + roll3,
					"Roll Results", JOptionPane.INFORMATION_MESSAGE);
		
		
			if (roll1 == roll2 && roll2 == roll3) {
				JOptionPane.showMessageDialog(null, "All three of your dice are a match!", "WINNER", JOptionPane.WARNING_MESSAGE);
			}
		
		
			else if (roll1 == roll2 || roll2 == roll3 || roll1 == roll3) {
				JOptionPane.showMessageDialog(null, "You rolled 2 of a kind", "WINNER", JOptionPane.WARNING_MESSAGE);
			}
		
			else {
				JOptionPane.showMessageDialog(null, "You have no matches", "Loser", JOptionPane.ERROR_MESSAGE);
			}
		
		
			selection = JOptionPane.showConfirmDialog(null, "Would you like to play the dice rolling game?", "Dice Game Begin " + round,
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		
			isYes = (selection == JOptionPane.YES_OPTION);
		
		}

	}

}
*/

