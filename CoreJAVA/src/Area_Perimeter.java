import java.util.Scanner;

class Rectangle {
	int length, breadth;

	public Rectangle(int l, int b) {
		length = l;
		breadth = b;
	}

	public void printArea() {
		int area = length * breadth;
		System.out.println("\nArea of Rectangle : " + area + " ");
	}

	public void printPerimeter() {
		int perimeter = 2*(length+breadth);
		System.out.println("Perimeter of Rectangle : "+perimeter+"");
	}
}

class Square extends Rectangle {

	public Square(int s) {
		super(s, s);
	}
}

public class Area_Perimeter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Length of Rectangle : ");
		int a = sc.nextInt();
		
		System.out.print("Enter a Breath of Rectangle : ");
		int b = sc.nextInt();
		
		System.out.print("Enter a Side of Square : ");
		int c = sc.nextInt();
		
		Rectangle R = new Rectangle(a, b);
		Square S = new Square(c);
		
		R.printArea();
		R.printPerimeter();
		S.printArea();
		S.printPerimeter();
	}
}