import java.util.Scanner;

public class Vowel_Consonunt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a Character to find it's Vowel or Consonunt. : ");
		char Alphabet = sc.next().charAt(0);

		switch (Alphabet) {
		case 'A':
			System.out.println("You Enter Alphabet " + Alphabet + " is Vowel.");
			break;

		case 'a':
			System.out.println("You Enter Alphabet " + Alphabet + " is Vowel.");
			break;

		case 'E':
			System.out.println("You Enter Alphabet " + Alphabet + " is Vowel.");
			break;

		case 'e':
			System.out.println("You Enter Alphabet " + Alphabet + " is Vowel.");
			break;

		case 'I':
			System.out.println("You Enter Alphabet " + Alphabet + " is Vowel.");
			break;

		case 'i':
			System.out.println("You Enter Alphabet " + Alphabet + " is Vowel.");
			break;

		case 'O':
			System.out.println("You Enter Alphabet " + Alphabet + " is Vowel.");
			break;

		case 'o':
			System.out.println("You Enter Alphabet " + Alphabet + " is Vowel.");
			break;

		case 'U':
			System.out.println("You Enter Alphabet " + Alphabet + " is Vowel.");
			break;

		case 'u':
			System.out.println("You Enter Alphabet " + Alphabet + " is Vowel.");
			break;

		default:
			System.out.println("You Enter Alphabet " + Alphabet + " is Vowel.");
		}
	}
}