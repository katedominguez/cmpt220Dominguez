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
    Scanner input= new Scanner(System.in);
    System.out.println("Please enter a string: ");
    String s= input.nextLine();
    System.out.println(countLetters(s));
  }
  public static int countLetters(String s){
    int num=0;
    for(int i=0; i<= s.length(); i++){
      //if(s.charAt(i)!= 0 && s.charAt(i)!= 1 && s.charAt(i)!= 2 && s.charAt(i)!= 3 && s.charAt(i)!= 4 && s.charAt(i)!= 5 && s.charAt(i)!= 6 && s.charAt(i)!= 7 && s.charAt(i)!= 8 && s.charAt(i)!= 9)
        num++;
    }
    return (num-1);
  }
}