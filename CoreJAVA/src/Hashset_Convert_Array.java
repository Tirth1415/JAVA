import java.util.HashSet;
import java.util.Iterator;

public class Hashset_Convert_Array {
	public static void main(String[] args) {
		HashSet<String> h1 = new HashSet<String>();

		h1.add("Dell");
		h1.add("HP");
		h1.add("Lenovo");
		h1.add("Asus");
		h1.add("Mac");

		System.out.println("Original Hash Set : " + h1);

		String[] Array = new String[h1.size()];
		h1.toArray(Array);

		System.out.println("\nArray Elements : ");
		for (String Element : Array) {
			System.out.println(Element);
		}
	}
}