import java.util.Scanner;

class Print_Area {
	public void area(float length, float width) {
		float Area = length * width;
		System.out.println("Area of Rectangle : " + Area);
	}

	public void area(float side) {
		float area = side * side;
		System.out.println("Area of Square : " + area);
	}
}

public class Area_Polymorphisam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Print_Area AP = new Print_Area();

		System.out.println("Select a Number \n 1.) Rectangle 2.) Square");
		int a = sc.nextInt();

		switch (a) {
		case 1:
			System.out.print("Enter a Length of Rectangle : ");
			float b = sc.nextFloat();
			System.out.print("Enter a Width of Rectangle : ");
			float c = sc.nextFloat();
			AP.area(b, c);
			break;

		case 2:
			System.out.print("Enter a Side of Square : ");
			float d = sc.nextFloat();
			AP.area(d);
			break;

		default:
			System.out.println("Sorry!!! \nPlease Enter a Valid Input.");
		}
	}
}