/**
file: Lab2Problem10.java;
Kaitlyn Dominguez
CMPT 220
Lab 3
February 21, 2017
*/
import java.util.Scanner;
public class Lab2Problem10{ //Problem 4.25 in textbook
  public static void main(String[] args){
    Scanner input= new Scanner(System.in);
	
	//Use StringBuilder to concatenate the characters in the license plate
	StringBuilder x = new StringBuilder();
	
	//Find letters
    for (int y = 0; y< 3; y++) {
      char letter = (char)(Math.random() * 26 + 'A');
      x.append(letter);
    }
	
	//Find numbers
    for (int z = 0; z < 4; z++) {
      char number = (char)(Math.random() * 10 + '0');
      x.append(number);
    }
	
	//Print out vehicle plate number
    System.out.println("Random vehicle plate number: " + x);
    }
}