import java.util.HashSet;

public class Retain_Same_Elements {
	public static void main(String[] args) {

		HashSet<String> h_set1 = new HashSet<String>();
		h_set1.add("Black");
		h_set1.add("White");
		h_set1.add("Yellow");
		h_set1.add("Red");
		h_set1.add("Green");
		System.out.println("First HashSet Content : " + h_set1);

		HashSet<String> h_set2 = new HashSet<String>();
		h_set2.add("Pink");
		h_set2.add("Orange");
		h_set2.add("Black");
		h_set2.add("Brown");
		h_set2.add("Red");
		System.out.println("Second HashSet Content : " + h_set2);
	
		h_set1.removeAll(h_set2);
		System.out.println("\nSame HashSet Content : "+h_set1);
	}
}