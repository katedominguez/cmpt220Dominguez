/**
file: Lab3Problem2.java;
Kaitlyn Dominguez
CMPT 220
Lab 3
February 21, 2017
*/

import java.util.Scanner;
public class Lab3Problem2{ //Problem 5.7 in textbook
  public static void main(String[] args){
	
    //tution starts at 10000
    double t= 10000.00;
   
    //find the increase in tution each year and for 4 years
    for (int x=0; x<14; x++)
    {
      double y= t* .05;
	t= t + y;
	if(x==10)
	  System.out.println("The tuition in 10 years will be: $" + t);
    }
    System.out.println("The total cost of four years' worth of tuition after the tenth year will be: $"+t);
  }
}
   
	