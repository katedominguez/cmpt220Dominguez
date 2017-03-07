/**
file: Lab3Problem3.java;
Kaitlyn Dominguez
CMPT 220
Lab 3
February 21, 2017
*/

import java.util.Scanner;
public class Lab3Problem3{ //Problem 5.12 in textbook
  public static void main(String[] args){
	
    //set n equal to 0
    int n=0;
	
    //find the right n
    while((n * n) <= 12000){
      n++;
    }
    System.out.println("n is equal to "+n);
 }
}