/**
file: Lab2Problem7.java;
Kaitlyn Dominguez
CMPT 220
Lab 3
February 21, 2017
*/
import java.util.Scanner;
public class Problem48{ //Problem 4.8 in textbook
  public static void main(String[] args){
    Scanner input= new Scanner(System.in);
    int ch;
	
    //Ask user for a ASCII code
    System.out.print("Enter an ASCII code:");
    ch = input.nextInt();
    
    //Assign and print ASCII code
    if(ch < 0 || ch > 127) {
      System.out.print("Invalid data. Number must be between 0 and 127.");
    } else {
      System.out.print("The character for ASCII code " + ch + " is " + (char)ch);
    }
  }
}
	
	