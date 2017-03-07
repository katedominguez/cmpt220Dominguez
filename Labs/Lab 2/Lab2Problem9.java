/**
file: Lab2Problem9.java;
Kaitlyn Dominguez
CMPT 220
Lab 3
February 21, 2017
*/
import java.util.Scanner;
public class Lab2Problem9{ //Problem 4.15 in textbook
  public static void main(String[] args){
    Scanner input= new Scanner(System.in);
	
    //ask user for a letter.charAt(0)
    System.out.println("Enter a letter: ");
    String letter= input.nextLine();
	
    //find out which number goes with the letter.charAt(0)
    if (letter.charAt(0)== 'A' || letter.charAt(0)== 'B' || letter.charAt(0)== 'C')
      System.out.println("The corresponding number is 2");
    else if (letter.charAt(0)== 'D' || letter.charAt(0)== 'E' || letter.charAt(0)== 'F')
      System.out.println("The corresponding number is 3");
    else if (letter.charAt(0)== 'G' || letter.charAt(0)== 'H' || letter.charAt(0)== 'I')
      System.out.println("The corresponding number is 4");
    else if (letter.charAt(0)== 'J' || letter.charAt(0)== 'K' || letter.charAt(0)== 'L')
      System.out.println("The corresponding number is 5");
    else if (letter.charAt(0)== 'M' || letter.charAt(0)== 'N' || letter.charAt(0)== 'O')
      System.out.println("The corresponding number is 6");
    else if (letter.charAt(0)== 'P' || letter.charAt(0)== 'Q' || letter.charAt(0)== 'R' || letter.charAt(0)== 'S')
      System.out.println("The corresponding number is 7");
    else if (letter.charAt(0)== 'T' || letter.charAt(0)== 'U' || letter.charAt(0)== 'V')
      System.out.println("The corresponding number is 8");
    else if (letter.charAt(0)== 'W' || letter.charAt(0)== 'X' || letter.charAt(0)== 'Y' || letter.charAt(0)== 'Z')
      System.out.println("The corresponding number is 9");
  }
}