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
    Scanner input= new Scanner(System.in);
    double[] array= new double[10];
    System.out.println("Please enter 10 numbers: ");
    for(int i=0; i< array.length; i++)
    {
      array[i]= input.nextDouble();
    }
    System.out.println(java.util.Arrays.toString(bubble(array)));
  }
  public static double[] bubble(double[] array){
    double temp = 0;  
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
