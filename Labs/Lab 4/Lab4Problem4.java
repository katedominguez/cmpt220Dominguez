/**
file: Lab4Problem4.java;
Kaitlyn Dominguez
CMPT 220
Lab 4 Problem 7.18
March 24, 2017
*/
import java.util.Scanner;
public class Lab4Problem4{ 
  public static void main(String[] args){
    //Create scanner
    Scanner input= new Scanner(System.in);
    //Create the array with a size of 10
    double[] array= new double[10];
    //Get the 10 numbers from the user
    System.out.println("Please enter 10 numbers: ");
    //Put the numbers in the array
    for(int i=0; i< array.length; i++)
    {
      array[i]= input.nextDouble();
    }
    //Call and print out bubble method
    System.out.println(java.util.Arrays.toString(bubble(array)));
  }
  public static double[] bubble(double[] array){
    double temp = 0; 
    //Use the bubble sort algorithm to change the array
    for(int i=0; i < array.length; i++){  
      for(int j=1; j < (array.length-i); j++){  
        if(array[j-1] > array[j]){  
          temp = array[j-1];  
          array[j-1] = array[j];  
          array[j] = temp;  
		}
	  }
	}
    return(array);
  }
}
