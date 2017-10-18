package Lab7;

import java.util.Scanner;

public class ComputeAreas {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean run = true;
		
		while (run = true) {
			
			System.out.println("Enter the side of a square");
			double squareSide = s.nextDouble();
			System.out.println("Side of square: " + squareSide);
			System.out.println("Area of square: " + squareArea(squareSide));
			
			System.out.println("Enter the width and length of a rectangle");
			double recWidth = s.nextDouble();
			double recLength = s.nextDouble();
			System.out.println("Width of rectangle: " + recWidth + "    Length of rectangle: " + recLength);
			System.out.println("Area of rectangle: " + rectangleArea(recWidth, recLength));
			
			System.out.println("Enter the radius of a circle");
			double radius = s.nextDouble();
			System.out.println("Radius of a circle: " + radius);
			System.out.println("Area of circle: " + circleArea(radius));
			
			System.out.println("Enter the base and height of a rectangle");
			double triBase = s.nextDouble();
			double triHeight = s.nextDouble();
			System.out.println("Base of triangle: " + triBase + "    Height of triangle: " + triHeight);
			System.out.println("Area of triangle: " + triangleArea(triBase, triHeight));
			
			System.out.println("Do you want to enter more numbers? (y/n)");
			String input = s.next();
			if (input.equals("n")) {
				run = false;
				System.out.println("Thanks for playing!");
				break;	
			}
		}
	}

	public static double squareArea(double side) {
		double f = Math.pow(side, 2);
		return f;
	}
	
	public static double rectangleArea(double width, double length) {
		double f = width*length;
		return f;
	}
	
	public static double circleArea(double radius) {
		double f = Math.pow(radius, 2);
		double g = f*Math.PI;
		return g;
	}
	
	public static double triangleArea(double base, double height) {
		double f = (base*height)/2;
		return f;
	}

}