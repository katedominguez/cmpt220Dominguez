/**
file: Lab5Problem2.java;
Kaitlyn Dominguez
CMPT 220
Lab 5 Problem 7.31
March 31, 2017
*/
import java.util.ArrayList;
import java.util.Scanner;
public class Lab5Problem2{ 
  public static void main(String[] args){
    //I had a weird compiling error with the arraylist for this problem and the third. I couldn't figure out why it wouldnt compile correctly
    //Create scanner
    Scanner input= new Scanner(System.in);
    //Add elements to list 1
    int[] list1 = new int[size];
    System.out.println("Enter list1: ");
    while (input.hasNextInt()) {
      list1.add(input.nextInt());
    }
    //Add elements to list 2
    List<int> list2 = new ArrayList<int>();
    System.out.println("Enter list 2: ");
    while (input.hasNextInt()) {
      list2.add(input.nextInt());
    }  
    //Call method merge and print out the result
    System.out.println("The merged list is " + merge(list1, list2) );
  }
  public static int[] merge(int[] list1, int[] list2){
    //Make a merged result array
    int[] result = new int[list1.length + list2.length];
    int x=0;
    for(int i=0; i<= list1.length; i++){
      for(int j=0; i<= list2.length; j++){
        if(list2[j] == list1[i]){
          result[x]= list1[i];
          x=x+1;
        }
        else if(list1[i] < list2[j]){
          result[x]= list1[i];
          result[x+1]= list2[j];
          x=x+2;
        }
        else{
          result[x]= list2[j];
          result[x+1]= list1[i];
          x=x+2;
        }
      }
    }
    return(result);
  }
}
