import java.util.Scanner;

public class Leap_year {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a Year to Find It's Year is Leap Year or Not? : ");
		int year = sc.nextInt();

		if (year % 4 == 0) {
			if (year % 400 == 0) {
				if (year % 100 == 0) {
					System.out.println("This Year is Leap Year : " + year);
				} else {
					System.out.println("This Year is Not Leap Year : " + year);
				}
			} else {
				System.out.println("This Year is Leap Year : " + year);
			}
		} else {
			System.out.println("This Year is Not Leap Year : " + year);
		}
	}
}