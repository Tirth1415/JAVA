import java.util.Scanner;

public class ArithmeticExceptionTwoNumber {
	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter a First Number : ");
			int a = sc.nextInt();
			
			System.out.print("Enter a Second Number : ");
			int b = sc.nextInt();
			
			int c= a/b;
			System.out.print("Result : "+c);
		} 
		
		catch (Exception e) {
			System.out.println("Error : "+e.getMessage());
			System.out.println("Error : "+e);
		}
	}
}