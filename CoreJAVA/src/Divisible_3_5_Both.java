import java.util.Scanner;

public class Divisible_3_5_Both {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Divisible by 3");
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ,");
			}
		}

		System.out.println("\n");
		System.out.println("Divisible by 5");
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0) {
				System.out.print(i + " ,");
			}
		}

		System.out.println("\n");
		System.out.println("Divisible by 3 or 5 (Both)");
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0 && i % 3 == 0) {
				System.out.print(i + " ,");
			}
		}
	}
}