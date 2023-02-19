import java.util.Scanner;

public class Ascii_Value {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a Character : ");
		char ascii = sc.next().charAt(0);
		int ascii2 = ascii;

		System.out.print("ASCII value of [" + ascii + "] character : " + ascii2);
	}
}