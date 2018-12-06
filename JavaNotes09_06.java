package damo1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class JavaNotes09_06 {
	
	public static void main(String[] args) {
/*		Scanner input = new Scanner(System.in);
		String bottles = "bottles";
		
		System.out.println("How many bottles are there?");
		int num = input.nextInt();
		 
		while (num > 0) {
			System.out.println(num + " " + bottles + " of beer on the wall");
			System.out.println(num + " " + bottles + " of beer");
			System.out.println("Take one down, pass it around");
			
			num = num - 1;
			
			if (num == 1) {
				bottles = "bottle";
			}
			if (num > 0) {
				System.out.println(num + " " + bottles + " of beer on the wall");
			}
			else {
				System.out.println("No bottles of beer on the wall");
			}
		}
		
		
		////////////////////////////////////////////////////////////////////////////////
		
		
		// data casting
		
		int num2 = 30;
		double bankBalance = 999.99;
		float myMoney = 47.82f;
		// using any decimal, by default is a double. to indicate float, you have to add an f at the end
		int dollars = (int)myMoney;
		// cast whenever doing any conversions
		
		System.out.println(bankBalance);
		float weeklyBudget = (float)(bankBalance/4);
		System.out.println(weeklyBudget);
		*/
		
		
		//////////////////////////////////////////////////////////////////////////////
		
		String result;
		
		/*
		JOptionPane.showMessageDialog(null, "Hello Dialog");
		//prints message on to the screen
		result = JOptionPane.showInputDialog("What is your name", "Enter Name");
		//
		JOptionPane.showMessageDialog(null,  "Hello" + result);
		*/
		
		//result = JOptionPane.showInputDialog(null, "DIsplay Message", "Title bar", JOptionPane.ERROR_MESSAGE);
		//JOptionPane.showMessageDialog(null, "Hello" + result);
		
		/* JOptionPane.ERROR_MESSAGE
		 * .INFORMATION_MESSAGE
		 * .PLAIN_MESSAGE
		 * .QUESTION_MESSAGE
		 * .WARNING_MESSAGE
		 */
		
		// result = JOptionPane.showInputDialog(null, "What is your area code?", "Area code information", JOptionPane.QUESTION_MESSAGE);
		
		String wageString, dependantsString;
		double wage, weeklyPay;
		int dependents;
		final double HOURS_IN_A_WEEK = 37.5; // final is the same as const in c++
		wageString = JOptionPane.showInputDialog(null, "Enter employee's hourly wage", "Salary Dialog 1", JOptionPane.INFORMATION_MESSAGE);
		weeklyPay = Double.parseDouble(wageString) * HOURS_IN_A_WEEK; //parse -- when u take an input and cut it up
		
		dependantsString = JOptionPane.showInputDialog(null, "How many dependants?", "Salary Dialog 2", JOptionPane.QUESTION_MESSAGE);
		
		dependents = Integer.parseInt(dependantsString);
		
		JOptionPane.showMessageDialog(null, "Weekly salary is $" + weeklyPay + "\nDeductions will be made for " + dependents + "dependents");
		
		
		
		
		
		
	}

}
