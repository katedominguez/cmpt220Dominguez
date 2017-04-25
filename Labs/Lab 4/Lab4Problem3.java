/**
file: Lab4Problem3.java;
Kaitlyn Dominguez
CMPT 220
Lab 4 Problem 7.9
March 24, 2017
*/
import java.util.Scanner;
public class Lab4Problem3{ 
  public static void main(String[] args){
    //Create a scanner
    Scanner input= new Scanner(System.in);
    //Create the array with a size of 10
    double[] numbers= new double[10];
    //Ask the user for the 10 numbers
    System.out.println("Please enter 10 numbers: ");
    //Add the 10 numbers to the array
    for(int i=0; i< numbers.length; i++)
    {
      numbers[i]= input.nextDouble();
    }
    //Call and print the min method
    System.out.println(min(numbers));
  }
  public static double min(double[] numbers){
    double smallest= numbers[0];
    //Find the smallest number in the array
    for(int x=0; x<= numbers.length-1; x++)
    {
      if(numbers[x] < smallest)
        smallest= numbers[x];
    }
    return(smallest);
  }
}
