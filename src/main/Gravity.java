/*
 * @author Divyansh Bhardwaj
 * @version 1.0
 * */
package main;

import java.util.Scanner;
// uncomment the above line to use input in your program.

public class Gravity {

	public static void main(String[] args) {
        double speed;
        double distance;
        double time;
        double g = 9.8;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the time");
        time = sc.nextInt();
        speed = g*time;
        distance=0.5*g*time*time;
        System.out.println("speed"+speed);
        System.out.println("The speed of the object at "+time+" seconds after it release is "+speed+" and the distance the object has in the "+time+" seconds after the release is "+distance);

	}
	// P.S: Refer to the README.md file for the problem statement, input & output.
}
