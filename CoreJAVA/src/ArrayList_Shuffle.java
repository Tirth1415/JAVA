import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_Shuffle {
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();

		l1.add("Black");
		l1.add("White");
		l1.add("Green");
		l1.add("Yellow");
		l1.add("Red");
		l1.add("Pink");

		System.out.println("List Before Shuffling : " + l1);
		Collections.shuffle(l1);
		System.out.println("List After Shuffling : " + l1);
	}
}