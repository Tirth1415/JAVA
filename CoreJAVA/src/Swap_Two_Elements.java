import java.util.ArrayList;
import java.util.Collections;

public class Swap_Two_Elements {
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Red");
		a1.add("Black");
		a1.add("White");
		a1.add("Green");
		a1.add("Yellow");
		System.out.println("Array List Before Swap : ");
		for (String a : a1) {
			System.out.println(a);
		}

		Collections.swap(a1, 0, 3);
		System.out.println("Array List After Swap : ");
		for (String b : a1) {
			System.out.println(b);
		}
	}
}