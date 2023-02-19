import java.util.Scanner;

abstract class ShapeArea {
	public abstract void RectangleArea(Double Length, double Width);

	public abstract void SquareArea(double side);

	public abstract void CircleArea(double radius);
}

class Area extends ShapeArea {

	@Override
	public void RectangleArea(Double Length, double Width) {
		double area = Length * Width;
		System.out.print("Rectangle Area : " + area);
		System.out.println("\n");
	}

	@Override
	public void SquareArea(double side) {
		double area = side * side;
		System.out.print("Square Area : " + area);
		System.out.println("\n");
	}

	@Override
	public void CircleArea(double radius) {
		double area = 3.14 * radius * radius;
		System.out.print("Circle Area : " + area);
		System.out.println("\n");
	}
}

public class Area_Rectangle_Circle_Square {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Area a = new Area();

		System.out.print("Enter Length of Rectangle : ");
		double length = sc.nextDouble();
		System.out.print("Enter Width of Rectangle : ");
		double width = sc.nextDouble();
		a.RectangleArea(length, width);

		System.out.print("Enter Side of Square : ");
		double side = sc.nextDouble();
		a.SquareArea(side);

		System.out.print("Enter Radius of Circle : ");
		double radius = sc.nextDouble();
		a.CircleArea(radius);
	}
}