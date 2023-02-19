import java.util.HashMap;

public class HashMap_Size_Count {
	public static void main(String[] args) {
		HashMap<Integer, String> h1 = new HashMap<Integer, String>();
		h1.put(1, "Fortuner");
		h1.put(2, "XUV 700");
		h1.put(3, "Seltoz");
		h1.put(4, "Harrier");
		h1.put(5, "Verna");
		System.out.println("Size of HashMap : " + h1.size());
	}
}