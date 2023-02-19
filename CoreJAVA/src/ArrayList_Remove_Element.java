import java.util.ArrayList;
import java.util.List;

public class ArrayList_Remove_Element {
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		l1.add("Mac");
		l1.add("Dell");
		l1.add("HP");
		l1.add("Lenovo");
		l1.add("Asus");
		System.out.println("Element : " + l1);

		l1.remove(3);
		System.out.println("\nAfter Removing Third Element from the ArrayList : " + l1);
	}
}