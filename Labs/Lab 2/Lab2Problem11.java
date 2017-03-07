/**
file: Lab2Problem11.java;
Kaitlyn Dominguez
CMPT 220
Lab 3
February 21, 2017
*/
import java.util.Scanner;
public class Lab2Problem11{ //Problem 4.26 in textbook
  public static void main(String[] args){
	// Create a Scanner
    Scanner input = new Scanner(System.in);

	// Receive the amount
	System.out.print("Enter an amount, for example 11.56: ");
	String amount = input.nextLine();

	// Extract number of dollars
	String numberOfOneDollars = amount.substring(0, amount.indexOf('.'));

	// Extract cents
	int cents = Integer.parseInt(amount.substring(amount.indexOf('.') + 1));

	// Find the number of quarters
	int numberOfQuarters = cents / 25;
	cents %= 25;

	// Find the number of dimes
	int numberOfDimes = cents / 10;
	cents %= 10;

	// Find the number of nickels
	int numberOfNickels = cents / 5;
	cents %= 5;

	// Display results
	System.out.println("Your amount " + amount + " consists of\n " 
						+ numberOfOneDollars + " dollars\n " 
						+ numberOfQuarters + " quarters\n "
						+ numberOfDimes + " dimes\n "
						+ numberOfNickels + " nickels\n "
						+ cents + " pennies\n ");
  }
}