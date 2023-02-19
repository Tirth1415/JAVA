import java.util.Scanner;

public class Secondmost_Character {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a String To Find the Second Most Frequent Character. : ");
		String str = sc.next();

		final int Noofchars = 256;
		int[] a = new int[Noofchars];

		for (int i = 0; i < str.length(); i++)
			(a[str.charAt(i)])++;

		int first = 0, second = 0;
		for (int i1 = 0; i1 < Noofchars; i1++) {
			if (a[i1] > a[first]) {
				second = first;
				first = i1;
			} else if (a[i1] > a[second] && a[i1] != a[first]) {
				second = i1;
			}
		}

		System.out.println("You Enter a String : " + str + "");
		System.out.println("Second Most Frequent Character : ");
	}
}