import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_Copy {
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		l1.add("1");
		l1.add("2");
		l1.add("3");
		l1.add("4");
		System.out.println("First List : " + l1);

		List<String> l2 = new ArrayList<String>();
		l2.add("A");
		l2.add("B");
		l2.add("C");
		l2.add("D");
		System.out.println("Second List : " + l2);
		
		Collections.copy(l1, l2);
		
		System.out.println("\nCopy First List to Second List :");
		System.out.println("List 1 : "+l1);
		System.out.println("List 2 : "+l2);
	}
}