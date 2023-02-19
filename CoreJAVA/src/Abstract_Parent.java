abstract class Parent1 {
	public abstract void message();
}

class subclass1 extends Parent1 {

	@Override
	public void message() {
		System.out.println("This is First Subclass.");
	}
}

class subclass2 extends Parent1 {

	@Override
	public void message() {
		System.out.println("This is Second Subclass.");
	}
}

public class Abstract_Parent {
	public static void main(String[] args) {
		subclass1 s1 = new subclass1();
		subclass2 s2 = new subclass2();

		s1.message();
		s2.message();
	}
}