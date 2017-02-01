import java.util.Scanner;
public class Problem3{
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the subtotal and a gratuity rate: ");
		double subtotal= input.nextDouble();
		double gratuity= input.nextDouble();
		double tip= (subtotal * (gratuity/100));
		double total= subtotal + tip;
		System.out.println("The gratuity is $"+ tip +" and total is $"+ total);		
	}
}