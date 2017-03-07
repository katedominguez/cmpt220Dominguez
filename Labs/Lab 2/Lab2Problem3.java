/**
file: Lab2Problem3.java;
Kaitlyn Dominguez
CMPT 220
Lab 2
February 12, 2017
*/
import java.util.Scanner;
public class Problem311{ //Problem 3.11 in textbook
  public static void main(String[] args){
    Scanner input= new Scanner(System.in);
	
      //the book says the user can input a number to represent the month-- no switch statements are needed if they are submitting integers
	
      //ask for data
      System.out.println(" Please enter a month (1=January, 2=February, etc.) and a year: ");
      int month= input.nextInt(); //store the month
      int year= input.nextInt(); //store the year
	
      //months with 31 days
      if(month== 1 || month== 3 || month== 5 || month== 7 || month== 8 || month== 10 || month== 12 )
	System.out.println(month+ "/" + year + " has 31 days");
      //months with 30 days
      else if(month== 4 || month== 6 || month== 9 || month==11)
	System.out.println(month+ "/" + year + " has 30 days");
      //February
      else if(month== 2){
	if(year%4 ==0) //if it is a leap year
          System.out.println(month+ "/" + year + " has 29 days");
	else //if it is a normal year
	  System.out.println(month+ "/" + year + " has 28 days");	    
	}
      else
	System.out.println("Invalid Response"); //will print in the user puts in the wrong type of response
  }
}