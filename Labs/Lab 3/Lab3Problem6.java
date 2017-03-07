/**
file: Lab3Problem6.java;
Kaitlyn Dominguez
CMPT 220
Lab 3
February 21, 2017
*/

import java.util.Scanner;
public class Lab3Problem6{ //Problem 6.3 in textbook
  public static void main(String[] args){
    Scanner input= new Scanner(System.in);
	
    System.out.println(" Enter a number : ");
    int p = input.nextInt();
        
     if(reverse(p)==true){
       System.out.println("Number : " + p + " is a palindrome");
     }else{
        System.out.println("Number : " + p + " is not a palindrome");
      }       
    }
  public static int reverse(int number){
    int reverse = 0;

     while (number != 0) {
        int remainder = number % 10;
        reverse = reverse * 10 + remainder;
        number = number / 10;
        }
     isPalindrome(reverse, number);
		
  }
  public static boolean isPalindrome(int rev, int num){
        if (num == rev) {
            return true;
        }
        return false;

  }
}