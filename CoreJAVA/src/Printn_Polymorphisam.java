class PrintNumber {

	public void print(int a) {
		System.out.println(a);
	}

	public void print(float b) {
		System.out.println(b);
	}

	public void print(double c) {
		System.out.println(c);
	}

	public void print(long d) {
		System.out.println(d);
	}

	public void print(char e) {
		System.out.println(e);
	}

	public void print(String f) {
		System.out.println(f);
	}
}

public class Printn_Polymorphisam {

	public static void main(String[] args) {
		PrintNumber obj = new PrintNumber();
		obj.print(9);
		obj.print(9.99f);
		obj.print(99.9999999999999);
		obj.print(99999999999999999L);
		obj.print('D');
		obj.print("DK");
	}
}