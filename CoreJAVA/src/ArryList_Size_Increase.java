import java.util.ArrayList;

public class ArryList_Size_Increase {
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>(4);

		a1.add("JAVA");
		a1.add("Python");
		a1.add("ASP.NET");
		a1.add("PHP");
		System.out.println("Original Array List : " + a1);

		a1.ensureCapacity(7);
		a1.add("JavaScript");
		a1.add("GO");
		a1.add("Kotlin");

		System.out.println("New Array List : " + a1);
	}
}