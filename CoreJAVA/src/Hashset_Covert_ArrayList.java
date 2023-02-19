import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Hashset_Covert_ArrayList {
	public static void main(String[] args) {
		HashSet<String> h1 = new HashSet<String>();

		h1.add("Black");
		h1.add("White");
		h1.add("Red");
		h1.add("Green");
		h1.add("Yellow");

		System.out.println("Original HAsh Set : " + h1);

		List<String> list = new ArrayList<String>(h1);

		System.out.println("ArrayList Contains : " + list);
	}
}