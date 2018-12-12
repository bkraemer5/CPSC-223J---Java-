/*
 * Brittany Kraemer		09/11/18
 * CPSC 223J - Professor Hamidi
 * Lab 03: Classes
 * This code creates a Car that accelerates/decelerates/travels and prints out the speed and distance it traveled
 */

package damo3;

public class CarMainClass {

	public static void main(String[] args) {
		
		Car lola = new Car();
		// new car called lola
		
		System.out.println("Lola has a current speed of " + lola.getSpeed() + " and has gone a distance of " + 
				lola.getDistance());
		// prints speed & distance
		
		lola.accelerate(50);
		// accelerates the car by 50 mph
		lola.travel(1.5);
		// the car travels 1.5 hours
		
		System.out.println("Lola has a current speed of " + lola.getSpeed() + " and has gone a distance of " + 
				lola.getDistance());
		// prints speed & distance
		
		lola.decelerate(15);
		// decelerates the car by 15mph
		lola.travel(1);
		// the car travels for 1 hour
		
		System.out.println("Lola has a current speed of " + lola.getSpeed() + " and has gone a distance of " + 
				lola.getDistance());
		// prints speed & distance

	}

}

/* 							OUTPUT
 * 
 * Lola has a current speed of 0 and has gone a distance of 0
 * Lola has a current speed of 50 and has gone a distance of 75
 * Lola has a current speed of 35 and has gone a distance of 35
 * 
 */
