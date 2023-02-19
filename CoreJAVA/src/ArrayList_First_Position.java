import java.util.ArrayList;
import java.util.List;

public class ArrayList_First_Position {
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		l1.add("Red");
		l1.add("Green");
		l1.add("Orange");
		l1.add("Black");
		l1.add("White");

		System.out.println(l1);

		l1.add(0, "Brwon");
		l1.add(5, "Yellow");

		System.out.println(l1);
	}
}