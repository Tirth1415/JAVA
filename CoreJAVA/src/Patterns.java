public class Patterns {
	public static void main(String[] args) {
		System.out.println("Patterns");
		System.out.println();

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
		System.out.println();

		int c = 1;
		for (int i = 0; i <= 5; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" " + c++);
			}
			System.out.println("");
		}
	}
}