/*
 * Brittany Kraemer		09/13/18
 * CPSC 223J - Professor Hamidi
 * Lab 03: Classes
 * This is a class that creates a car with speed and distance
 */

package damo3;

public class Car {
	
	private int speed;
	private int distance;
	
	// sets speed for the car
	public void setSpeed(int s) {
		speed = s;
	}
	
	// gets the car's speed
	public int getSpeed() {
		return speed;
	}
	
	// sets the distance for the car
	public void setDistance(int d) {
		distance = d;
	}
	
	// gets the distance of the car
	public int getDistance() {
		return distance;
	}
	
	// accelerates the car by a new speed
	public void accelerate(int newSpeed) {
		if (newSpeed > 0) {
			speed = speed + newSpeed;
		}
	}
	
	// decelerates the car by a new speed
	public void decelerate(int newSpeed) {
		if (newSpeed > 0) {
			speed = speed - newSpeed;
		}
	}
	
	// takes in amount of hours the car traveled and calculates distance
	public void travel(double hours) {
		distance = (int)(speed*hours);
		
	}
	
	
	
};
