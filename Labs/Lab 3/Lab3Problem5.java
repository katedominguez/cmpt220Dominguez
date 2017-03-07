/**
file: Lab3Problem5.java;
Kaitlyn Dominguez
CMPT 220
Lab 3
February 21, 2017
*/

import java.util.Scanner;
public class Lab3Problem5{ //Problem 6.2 in textbook
  public static void main(String[] args){
    Scanner input= new Scanner(System.in);
	
    //get the integer from the user
    System.out.println("Enter an integer: ");
    long num= input.nextInt();
	
    //call method
    System.out.println(sumDigits(num));
  }
  public static long sumDigits(long n){
    long num1= n%10;
    long num2= n%10;
    long num3= n%10;
    long num4= n%10;
	
    long sum= num1 + num2 + num3 + num4;
    return sum;
  }
}