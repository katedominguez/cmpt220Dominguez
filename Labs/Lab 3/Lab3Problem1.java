/**
file: Lab3Problem1.java;
Kaitlyn Dominguez
CMPT 220
Lab 3
February 21, 2017
*/

import java.util.Scanner;
public class Lab3Problem1{ //Problem 5.1 in textbook
  public static void main(String[] args){
    Scanner input= new Scanner(System.in);

    //Ask user for the value
    System.out.println("Enter an integer, the input ends if it is 0: ");
    int num= input.nextInt();
	
    int positive = 0; 
    int negative = 0; 
    int total = 0; 
    double sum = 0.0; //need the sum to find the average
		
    // While the number is not 0
    while (num != 0) {
    // Count the positive
      if (num > 0 )
        positive++;
    // Count the negative
      else
	negative++;
    // Count the total
	total++;
	sum += num;
	num = input.nextInt();
    }
		
    // Find the average
    double average = sum / total;
		
    System.out.println("The number of positives is " + positive);
    System.out.println("The nubmer of negatives is " + negative);
    System.out.println("The total is " + total);
    System.out.println("The average is " + average);
  }
}
	
	