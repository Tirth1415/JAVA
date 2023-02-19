import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int fact = 1;
		System.out.print("Enter a Number to Find Factorial :");
		int a = sc.nextInt();
		for (int b = 1; b <= a; b++) {
			fact = fact * b;
		}
		System.out.print("Factorial of " + a + " = " + fact);
	}
}