import java.util.Scanner;
public class Grade{
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter the following as a percentage: ");
		System.out.println("Midterm Exam: ");
		double a=input.nextDouble();
		System.out.println("Final Exam: "); 
		double b=input.nextDouble();
		System.out.println("Projects: ");
		double c=input.nextDouble();
		System.out.println("Homeworks+Labs: ");
		double d=input.nextDouble();
		double grade= ((a+b+c+d)/4);
		System.out.println("Your final grade is: "+grade+ "%");
		
	}
}