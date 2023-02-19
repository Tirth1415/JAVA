import java.util.ArrayList;

public class Replace_Element_Arraylist {
	public static void main(String[] args) {

		ArrayList<String> car = new ArrayList<String>();

		car.add("Fortuner");
		car.add("Endeavour");
		car.add("Scorpio");

		System.out.println("Original Array List : " + car);

		String new_car1 = "Range Rover";
		String new_car2 = "Discover";

		car.set(1, new_car1);
		car.set(2, new_car2);

		System.out.println("\nReplace Second & Third Element : ");
		for (int i = 0; i < car.size(); i++) {
			System.out.println(car.get(i));
		}
	}
}