/**
file: Lab5Problem1.java;
Kaitlyn Dominguez
CMPT 220
Lab 5 Problem 7.20
March 31, 2017
*/
import java.util.Scanner;
public class Lab5Problem1{ 
  public static void main(String[] args){
    Scanner input= new Scanner(System.in);
    double[] array= new double[10];
    System.out.println("Please enter 10 numbers: ");
    for(int i=0; i< array.length; i++)
    {
      array[i]= input.nextDouble();
    }
    System.out.println(java.util.Arrays.toString(selectionSort(array)));
   }
   public static double[] selectionSort(double[] array){
     for(int x= array.length-1; x>=0; x--){
       //Find the largest number in the array
       double currentMax= array[x];
       int currentMaxIndex= x;
       for(int y=x-1; y>= 0; y--){
         if(currentMax < array[y]){
           currentMax= array[y];
           currentMaxIndex= y;
        }
       }
       //Swap array[x] with array[currentMaxIndex] if necessary
       if(currentMaxIndex != x){
         array[currentMaxIndex] = array[x];
         array[x]= currentMax;
        }
     }
	 return(array);
   }
}
       