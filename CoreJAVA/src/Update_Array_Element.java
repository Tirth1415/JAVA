import java.util.ArrayList;
import java.util.List;

public class Update_Array_Element {
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		l1.add("Mac");
		l1.add("Dell");
		l1.add("HP");
		l1.add("Lenovo");
		System.out.println("Element : " + l1);

		l1.add(3, "Samsung");
		System.out.println("Add Element(Samsung) at Index 3 :" + l1);
	}
}