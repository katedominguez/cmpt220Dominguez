/**
file: Lab3Problem2.java;
Kaitlyn Dominguez
CMPT 220
Lab 3
February 21, 2017
*/
import java.util.Scanner;
public class Problem38{ //Problem 3.8 in textbook
  public static void main(String[] args){
    Scanner input= new Scanner(System.in);
      int first;
      int second;
      int third;
      //ask user for 3 integers
      System.out.println("Please enter 3 integers: ");
      int x= input.nextInt();
      int y= input.nextInt();
      int z= input.nextInt();

      // if x is the first number
      if(x<y){
	if(x<z){
	  first= x;
	  if(y<z){
	    second=y;
	    third=z;
	   } else{
	    second=z;
	    third=y;
	   }
	 }
       }
       //if y is the first number
       else if(y<x){
         if(y<z){
	   first= y;
	   if(x<z){
	     second=x;
	     third=z;
	   } else{
	     second=z;
	     third=x;
	   }
	  }
	}
	//if z is the first number
	else if(z<x){
	  if(z<y){
	    first= z;
	    if(y<x){
	      second=y;
	      third=x;
	    } else{
	      second=x;
	      third=y;
	    }
	  }
	}
	  
	    
		
	  
		
	