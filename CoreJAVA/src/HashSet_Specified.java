import java.util.HashSet;

public class HashSet_Specified {
	public static void main(String[] args) {
		HashSet<String> h1 = new HashSet<String>();

		h1.add("Gujrati");
		h1.add("Punjabi");
		h1.add("Chinese");
		h1.add("Italian");
		h1.add("Maxican");

		System.out.println("The Hash Set : " + h1);
	}
}