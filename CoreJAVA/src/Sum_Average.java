import java.util.Scanner;

public class Sum_Average {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input 5 Numbers and Their Sum and Average using for loop");

		int sum = 0, n = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.print("Enter Your[" + i + "] Number : ");
			n = sc.nextInt();

			sum = sum + n;
		}

		System.out.print("Sum of Array : " + sum);
		System.out.println();

		double average = sum / 5;
		System.out.print("Avrage of Array : " + average);
	}
}