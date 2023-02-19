class Triangle {
	Triangle(int a, int b, int c) {
		int area = (int) (0.5 * a * b);
		System.out.print("Area of Triangle : " + area + "\n");

		int peri = a + b + c;
		System.out.print("Perimeter of Triangle : " + peri);
	}
}

public class Triangle_Area_Perimeter {
	public static void main(String[] args) {

		int a = 3, b = 4, c = 5;
		Triangle obj = new Triangle(a, b, c);
	}
}