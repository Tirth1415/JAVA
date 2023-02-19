import java.util.ArrayList;
import java.util.List;

public class ArrayList_Iterate {
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		l1.add("Red");
		l1.add("Green");
		l1.add("Black");
		l1.add("White");
		l1.add("Orange");

		for (String element : l1) {
			System.out.println(element);
		}
	}
}