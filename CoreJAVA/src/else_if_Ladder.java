import java.util.Scanner;

public class else_if_Ladder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Your Marks (out of 100): ");
		int a = sc.nextInt();

		if (a >= 91) {
			System.out.println("Your Grade is : A+");
		} else if (a <= 90 && a >= 81) {
			System.out.println("Your Grade is : A");
		} else if (a <= 80 && a >= 71) {
			System.out.println("Your Grade is : B");
		} else if (a <= 70 && a >= 61) {
			System.out.println("Your Grade is : C");
		} else if (a <= 60 && a >= 51) {
			System.out.println("Your Grade is : D");
		} else if (a <= 50 && a >= 41) {
			System.out.println("Your Grade is : DD");
		} else {
			System.out.println("Sorry!!! \n You Fail.");
		}

	}
}