/**
file: Lab6Problem2.java;
Kaitlyn Dominguez
CMPT 220
Lab 6 Problem 9.13
April 20, 2017
*/
import java.util.Scanner;
public class Lab6Problem2{ 
  public static void main(String[] args) {
		// Create a scanner
		Scanner input = new Scanner(System.in);

		// Have the user enter in a 2-dimensional array
		System.out.print("Enter the number of rows and columns in the array: ");
		int rows = input.nextInt();
		int columns = input.nextInt();

		// Create a matrix
		double[][] array = new double[rows][columns]; 
		System.out.println("Enter the array: ");
		for (int x = 0; x < array.length; x++) {
			for (int y = 0; y < array[x].length; y++) {
				array[x][y] = input.nextDouble();
			}
		}

		// let max equal what locateLargest returns
		 double max = locateLargest(array);

		//Find the location of the largest element in the array
		System.out.println("The location of the largest element is " + max.maxValue + " at (" + max.r + ", " + max.c + ")");
	}
	public double locateLargest(double[][] a) {
	  double r;         
	  double c;			
	  double maxValue;	
		maxValue = a[0][0];
		r = 0;
		c = 0;
		for (int b = 0; b < a.length; b++) {
			for (int d = 0; d < a[b].length; d++) {
				if (a[b][d] > maxValue) {
					maxValue = a[b][d];
					r = b;
					c = d;
				}
			}
	  }
  return r;
  return c;
  return maxValue;
}
}
