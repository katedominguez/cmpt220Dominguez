/**
file: Lab6Problem1.java;
Kaitlyn Dominguez
CMPT 220
Lab6 Problem 9.1
April 20, 2017
*/
import java.util.Scanner;
public class Lab6Problem1{ 
  public static void main(String[] args){
    // width =4, height=40
		Rectangle rect1 = new Rectangle(4, 40);

		// width= 3.5, height=35.9
		Rectangle rect2 = new Rectangle(3.5, 35.9);

		// Display the width, height, area, & perimeter of rect1
		System.out.println("\n Rectangle 1");
		System.out.println("-------------");
		System.out.println("Width:     " + rect1.width);
		System.out.println("Height:    " + rect1.height);
		System.out.println("Area:      " + rect1.getArea());
		System.out.println("Perimeter: " + rect1.getPerimeter());

		// Display the width, height, area, & perimeter of rect2
		System.out.println("\n Rectangle 2");
		System.out.println("-------------");
		System.out.println("Width:     " + rect2.width);
		System.out.println("Height:    " + rect2.height);
		System.out.println("Area:      " + rect2.getArea());
		System.out.println("Perimeter: " + rect2.getPerimeter());
  }  
  public class Rectangle {
	  double width;	// Width of rectangle
	  double height;	// Height of rectangle

	  //Constructor
	  Rectangle(){
		  width = 1;
		  height = 1;
	  } 

	  //Constructor with width and height
	  Rectangle(double newWidth, double newHeight) {
		  width = newWidth;
		  height = newHeight;
	  }

	  // Get the area of the rectangle
	  double getArea() {
		  return width * height; 
	  }

	  // Get the perimeter of the rectangle
	  double getPerimeter() {
		  return 2 * (width + height);
	  }
  }
}