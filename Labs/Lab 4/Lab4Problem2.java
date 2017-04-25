/**
file: Lab4Problem2.java;
Kaitlyn Dominguez
CMPT 220
Lab 4 Problem 6.20
March 24, 2017
*/
import java.util.Scanner;
public class Lab4Problem2{ 
  public static void main(String[] args){
    //Create a Scanner
    Scanner input= new Scanner(System.in);
    System.out.println("Please enter a string: ");
    String s= input.nextLine();
    //Call method countLetters
    System.out.println(countLetters(s));
  }
  public static int countLetters(String s){
    //Create a variable to track the number of letters in the string
    int num=0;
    //Count the number of letters in the string
    for(int i=0; i<= s.length(); i++){
        num++;
    }
    return (num-1);
  }
}
