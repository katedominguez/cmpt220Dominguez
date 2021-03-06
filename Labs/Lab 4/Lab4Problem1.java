/**
file: Lab4Problem1.java;
Kaitlyn Dominguez
CMPT 220
Lab 4 Problem 6.8
March 24, 2017
*/
import java.util.Scanner;
public class Lab4Problem1{ 
  public static void main(String[] args){
    //Create scanner
    Scanner input= new Scanner(System.in);
    //Print heading and get temperatures from the user
    System.out.println("Celsius          Fahrenheit          |          Fahrenheit          Celsius");
    System.out.println("___________________________________________________________________________");
    double celsius= input.nextDouble();
    double fahrenheit= input.nextDouble();
    //Call the methods
    double ctof= celsiusToFahrenheit(celsius);
    double ftoc= fahrenheitToCelsius(fahrenheit);
    //Print out the answers
    System.out.print("                                       " + ctof + "                          " + ftoc);
  }
  public static double celsiusToFahrenheit(double celsius){
    double f= (9.0 / 5) * celsius + 32;
    return f;
  }
  public static double fahrenheitToCelsius(double fahrenheit){
    double c= (5.0 / 9) * (fahrenheit - 32);
    return c;
  }
}
