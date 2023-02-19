import java.util.ArrayList;
import java.util.List;

public class ArrayList_Search_Element {
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		l1.add("MAC");
		l1.add("Dell");
		l1.add("HP");
		l1.add("Lenovo");

		if (l1.contains("HP")) {
			System.out.println("Yes, Found the Element.");
		} else {
			System.out.println("There is No Such Element.");
		}
	}
}