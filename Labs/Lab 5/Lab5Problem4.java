/**
file: Lab5Problem4.java;
Kaitlyn Dominguez
CMPT 220
Lab 5 Problem 8.13
March 31 , 2017
*/
import java.util.Scanner;
public class Lab5Problem4{ 
  public static void main(String[] args){
    //Create scanner
    Scanner input= new Scanner(System.in);
    //Get the dimensions of the array
    System.out.println("Enter the number of rows and columns of the array: ");
    int r= input.nextInt();
    int c = input.nextInt();
    double[][] a = new double[r][c];
    //Get the elements of the array
    System.out.println("Enter the array: ");
    for (int x = 0; x < r; x++)
      for (int y = 0; y < c; y++)
         a[x][y] = input.nextDouble();
    //Call locateLargest method and print out the result
    System.out.println("The location of the largest element is at " + java.util.Arrays.toString(locateLargest(a)));
  }
  public static int[] locateLargest(double[][] a){
    //Create location and largest
    int[] location = new int[] { 0, 0 };
    double largest = a[0][0];
    //Find the largest and the location
    for (int b = 0; b < a.length; b++) {
      for (int c = 0; c < a[b].length; c++) {
        if (a[b][c] > largest) {
          location[0] = b;
          location[1] = c; 
          largest = a[b][c];
        }
      }
    }
    return(location);
  }
}
