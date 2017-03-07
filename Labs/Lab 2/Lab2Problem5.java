/**
file: Lab2Problem5.java;
Kaitlyn Dominguez
CMPT 220
Lab 3
February 21, 2017
*/
import java.util.Scanner;
public class Problem41{ //Problem 4.1 in textbook
  public static void main(String[] args){
    Scanner input= new Scanner(System.in);
    //ask user for input (r)
    System.out.println("Enter the length from the center to a vertex: ");
    double r= input.nextDouble();
	
    //calculate length of a side (s)
    double s= ((2 * r) * (Math.sin((Math.PI)/5)));
	
    //calculate area of pentagon (area)
    double area= ((5 * (s * s)) / (4* (Math.tan((Math.PI)/5)));
	
    //Print out answer
    System.out.println("The area of the pentagon is " + area);	
  }
}	 