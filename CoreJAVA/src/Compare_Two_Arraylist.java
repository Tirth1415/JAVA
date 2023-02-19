import java.util.ArrayList;

public class Compare_Two_Arraylist {
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("MAC");
		a1.add("Dell");
		a1.add("HP");
		a1.add("Lenovo");

		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("MAC");
		a2.add("Dell");
		a2.add("HP");
		a2.add("Len");

		ArrayList<String> a3 = new ArrayList<String>();
		for (String e : a1) {
			a3.add(a2.contains(e) ? "Yes" : "No");
			System.out.println(a3);
		}
	}
}