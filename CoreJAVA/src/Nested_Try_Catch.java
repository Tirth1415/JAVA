public class Nested_Try_Catch {
	public static void main(String[] args) {
		try {
			try {
				try {
					int arr[] = { 1, 2, 3 };
					System.out.println(arr[10]);
				} catch (ArithmeticException e) {
					System.out.println("Arithmetic Exception");
					System.out.println("Inner Try Block 2");
				}
			} catch (ArithmeticException e) {
				System.out.println("Arithmetic Exception");
				System.out.println("Inner Try Block 1");
			}
		} catch (ArrayIndexOutOfBoundsException e4) {
			System.out.println(e4);
			System.out.println("Outer Main try block");
		} catch (Exception e5) {
			System.out.println("Exception");
			System.out.println("Handled in Main Try-Block.");
		}
	}
}