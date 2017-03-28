/**
file: Project1.java;
Kaitlyn Dominguez
CMPT 220
Project 1
March 24, 2017
*/

import java.util.Scanner;
public class Project1{ 
  public static void main(String[] args){
	  
    //Create Scanner
    Scanner input= new Scanner(System.in);
	
    //Get the size of both arrays
    int sizeFirst= input.nextInt();
    int sizeSecond= input.nextInt();
	 
    //Get the elements of both arrays
    double[] vFirst= new double[sizeFirst];
    double[] vSecond= new double[sizeSecond];
	
    //Put elements into the arrays
    for(int x=0; x< sizeFirst; x++)
      vFirst[x]= input.nextDouble();
    for(int y=0; y< sizeSecond; y++)
      vSecond[y]= input.nextDouble();
	
     //Call method convolveVectors
     convolveVectors(vFirst, vSecond);
  }
  public static double[] convolveVectors(double[] vFirst, double[] vSecond) {
    double[] vResult = new double[(vFirst.length + vSecond.length) - 1];
    // create for loop to go through the index
    for(int i=0; i< vResult.length; i++)
    {
      //Create for loop to go through shifts
      for(int shift=0; shift< vResult.length; shift++)
      {
	//Implement try catch to prevent going out of bounds
        try{
	  vResult[i]+= vFirst[i-shift] * vSecond[shift];
	} catch(IndexOutOfBoundsException e){
	}
      }
    }
    //Print out the elements of the result array
    for(int p=0; p< vResult.length; p++)
      System.out.print(vResult[p] + " ");
    return vResult;  
  }
}
	
