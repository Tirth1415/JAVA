class Shape {
	public void print_shape() {
		System.out.println("This is Shape.");
	}
}

class rectangle1 extends Shape {
	public void print_rect() {
		System.out.println("This is Rectangular Shape.");
	}
}

class Circle extends Shape {
	public void print_circle() {
		System.out.println("This is Circular Shape.");
	}
}

class Square2 extends rectangle1 {
	public void print_square() {
		System.out.println("Square is a Rectangle.");
	}
}

public class Inheritance_Shape {
	public static void main(String[] args) {
		Square2 sq2 = new Square2();
		sq2.print_shape();
		sq2.print_rect();
	}
}