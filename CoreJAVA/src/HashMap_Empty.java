import java.util.HashMap;

public class HashMap_Empty {
	public static void main(String[] args) {
		HashMap<Integer, String> h1 = new HashMap<Integer, String>();
		h1.put(1, "Dell");
		h1.put(2, "HP");
		h1.put(3, "Lenovo");

		boolean result = h1.isEmpty();
		System.out.println("Hash Map Empty : " + result);

		h1.clear();
		result = h1.isEmpty();
		System.out.println("Hash Map is Clear and Now check Empty ? : " + result);
	}
}