import java.util.ArrayList;

public class Join_Two_ArrayList {
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Fortuner");
		a1.add("Harrier");
		a1.add("Creata");
		System.out.println("List of First Array : " + a1);

		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("XUV 700");
		a2.add("Seltoz");
		a2.add("Verna");
		System.out.println("List of Second Array ; " + a2);

		ArrayList<String> a = new ArrayList<String>();
		a.addAll(a1);
		a.addAll(a2);
		System.out.println("\nNew Array (Join First & Second): " + a);
	}
}