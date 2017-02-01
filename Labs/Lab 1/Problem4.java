import java.util.Scanner;
public class Problem4{
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a number between 0 and 1000: ");
		int x=input.nextInt();
		if(x>0 && x<=1000){
			System.out.println(x%10);
			x= x/10;
		}
		else
			System.out.println("Invalid Input");
	}
}