import java.util.HashSet;

public class HashSet_Get_Number {
	public static void main(String[] args) {
		HashSet<String> h1 = new HashSet<String>();
		h1.add("HP");
		h1.add("Black");
		h1.add("White");
		h1.add("Pink");
		h1.add("Yellow");
		System.out.println("Original Hash Set : " + h1);
		System.out.println("Size of The Hash Set : " + h1.size());
	}
}