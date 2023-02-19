import java.util.HashMap;
import java.util.Map;

public class HashMap_Specified_Key {
	public static void main(String[] args) {
		HashMap<Integer, String> h1 = new HashMap<Integer, String>();
		h1.put(1, "Red");
		h1.put(2, "Green");
		h1.put(3, "Black");
		h1.put(4, "White");
		h1.put(5, "Blue");

		for (Map.Entry x : h1.entrySet()) {
			System.out.println(x.getKey() + " " + x.getValue());
		}
	}
}