import java.util.Scanner;

public class Segregate_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a String : ");
		String str = sc.nextLine();

		int letter = 0, space = 0, digit = 0, other_Character = 0;
		char ch[] = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(ch[i])) {
				letter++;
			} else if (Character.isDigit(ch[i])) {
				digit++;
			} else if (Character.isSpaceChar(ch[i])) {
				space++;
			} else {
				other_Character++;
			}
		}

		System.out.println("\nLength of String : " + str.length());
		System.out.println("You Input String in Letters Are :" + letter);
		System.out.println("You Input String in Digits Are :" + digit);
		System.out.println("You Input String in Blank Spaces Are :" + space);
		System.out.println("You Input String in Other Characters Are :" + other_Character);
	}
}