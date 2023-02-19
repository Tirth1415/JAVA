import java.util.Scanner;

public class Greatest_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Three Number to find Greatest of Them.");
		System.out.print("Enter First Number : ");
		int a = sc.nextInt();
		System.out.print("Enter Second Number : ");
		int b = sc.nextInt();
		System.out.print("Enter Third Number : ");
		int c = sc.nextInt();

		if (a > b) {
			if (a > c) {
				System.out.println("The Greatest Number is A : " + a);
			} else {
				System.out.println("The Greatest Number is C : " + c);
			}
		} else {
			if (b > c) {
				System.out.println("The Greatest Number is B : " + b);
			} else {
				System.out.println("The Greatest Number is c : " + c);
			}
		}

		// (a>b) ? ((a>c)? printf("\n A is Largest. = %d",a) : printf ("\n C is Largest.
		// = %d",c)) : ((b>c) ? printf("\n B is Largest. = %d",b) : printf("\n C is
		// Largest. = %d",c));

		// (a>b) ? ((a>c)? System.out.println("The Greatest Number is A : "+a) :
		// System.out.println("The Greatest Number is C : "+c)) : ((b>c) ?
		// System.out.println("The Greatest Number is B : "+b) : System.out.println("The
		// Greatest Number is C : "+c));

	}
}