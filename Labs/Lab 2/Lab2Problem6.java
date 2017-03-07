/**
file: Lab2Problem6.java;
Kaitlyn Dominguez
CMPT 220
Lab 3
February 21, 2017
*/
import java.util.Scanner;
public class Problem45{ //Problem 4.5 in textbook
  public static void main(String[] args){
    Scanner input= new Scanner(System.in);
	
    //ask user for the # of sides(n)
    System.out.println("Enter the number of sides: ");
    double n= input.nextDouble();
	
    //ask user for the side (s)
    System.out.println("Enter the side: ");
    double s= input.nextDouble();
	
	
    //calculate area (area)
    double area= ((n * (s * s)) / (4 * (Math.tan((Math.PI)/n))));
	
    //Print out area
    System.out.println("The area of the polygon is " + area);
  }
}
	