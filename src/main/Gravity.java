/*
 * @author Pranjal jain
 * @version 1.0
**/
package main;

import java.util.Scanner;


public class Gravity {

	public static void main(String[] args) {
        double speed;
        double distance;
        double time;
        double g = 9.8;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the time");
        time = sc.nextDouble();
        speed = g*time;
        distance=0.5*g*time*time;
        System.out.println("speed"+speed);
        System.out.println("The speed of the object at "+time+" seconds after it release is "+speed+" and the distance the object has in the "+time+" seconds after the release is "+distance);

	}

}
6