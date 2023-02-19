import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_Sort {
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		l1.add("Fortuner");
		l1.add("Audi");
		l1.add("BMW");
		l1.add("Seltoz");

		System.out.println("List Before Sort : " + l1);
		Collections.sort(l1);
		System.out.println("List After Sort : " + l1);

	}
}