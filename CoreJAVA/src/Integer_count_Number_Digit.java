import java.util.Scanner;

public class Integer_count_Number_Digit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a Any number : ");
		long a = sc.nextLong();
		int count = 0;

		while (a != 0) {
			a /= 10; 				// a = a/10
			++count;
		}

		System.out.print("Number of Digits : " + count);
	}
}