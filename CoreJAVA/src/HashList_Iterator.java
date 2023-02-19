import java.util.HashSet;
import java.util.Iterator;

public class HashList_Iterator {
	public static void main(String[] args) {
		HashSet<String> h1 = new HashSet<String>();
		h1.add("Fortuner");
		h1.add("Audi");
		h1.add("BMW");
		h1.add("Seltoz");

		Iterator<String> a = h1.iterator();

		while (a.hasNext()) {
			System.out.println(a.next());
		}
	}
}