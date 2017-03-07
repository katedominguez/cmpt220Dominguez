/**
file: Lab2Problem1.java;
Kaitlyn Dominguez
CMPT 220
Lab 3
February 21, 2017
*/
import java.util.Scanner;
public class Problem34{ //Problem 3.4 in textbook
  public static void main(String[] args){
    // generate random number
    int x=  1+(Math.random() *12);
	  
    //assign each number to a month
    if(x==1)
      System.out.println("January");
    else if(x==2)
      System.out.println("February");
    else if(x==3)
      System.out.println("March");
    else if(x==4)
      System.out.println("April");
    else if(x==5)
      System.out.println("May");
    else if(x==6)
      System.out.println("June");
    else if(x==7)
      System.out.println("July");
    else if(x==8)
      System.out.println("August");
    else if(x==9)
      System.out.println("September");
    else if(x==10)
      System.out.println("October");
    else if(x==11)
      System.out.println("November");
    else if(x==12)
      System.out.println("December");
  }
}
		