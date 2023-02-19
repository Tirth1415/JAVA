import java.util.ArrayList;
import java.util.List;

public class ArrayList_Retrive {
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		l1.add("Red");
		l1.add("Green");
		l1.add("Orange");
		l1.add("White");
		l1.add("Black");

		System.out.println(l1);

		String element = l1.get(0);
		System.out.println("First Element : " + element);
		element = l1.get(2);
		System.out.println("Third Element : " + element);
	}
}