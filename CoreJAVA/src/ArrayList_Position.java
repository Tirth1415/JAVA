import java.util.ArrayList;

public class ArrayList_Position {
	public static void main(String[] args) {
		ArrayList<String> A1 = new ArrayList<String>();

		A1.add("Sunday");
		A1.add("Monday");
		A1.add("Tuesday");
		A1.add("Wednesday");
		A1.add("Thrusday");
		A1.add("Friday");
		A1.add("Saturday");

		System.out.println("Original Array List : " + A1);

		System.out.println("\nPrint Using Index of an Element : ");
		int a = A1.size();

		for (int i = 0; i < a; i++) {
			System.out.println(A1.get(i));
		}
	}
}