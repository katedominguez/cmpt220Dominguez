/**
file: Lab5Problem3.java;
Kaitlyn Dominguez
CMPT 220
Lab 5 Problem 7.32
March 31 , 2017
*/
import java.util.Scanner;
public class Lab5Problem3{ 
  public static void main(String[] args){
    //Create scanner
    Scanner input= new Scanner(System.in);
    List<int> list = new ArrayList<int>();
    System.out.println("Enter list: ");
    list.length= input.nextInt();
    while (input.hasNextInt()) {
      list.add(input.nextInt());
    }
    System.out.println(partition(list));
  }
  public static int partition(int[] list){
    int p= (list.length)/2;
    List<int> result= new ArrayList<int>();
    for(int x=0; x<=list.length; x++){
      for(int y=0; y<=list.length; y++){
        if(list[x] < list[y])
          result[x]= list[x];
       }
    }
    return(result);
  }
}