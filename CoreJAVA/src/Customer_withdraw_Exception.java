import java.util.Scanner;

class MinimumAccountBalance extends Exception {
	String message;

	public MinimumAccountBalance(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return message;
	}
}

public class Customer_withdraw_Exception {

	static int Balance = 2000;

	public static void main(String[] args) throws MinimumAccountBalance {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a Amount To Withdrawal : ");
		int a = sc.nextInt();
		int Remaining_Balance = Balance - a;
		try {
			if (Balance < a) {
				throw new MinimumAccountBalance("Insufficient Funds in your Account.\nBalance in your Acoount is :" + Balance);
			} else {
				System.out.println("Please Take the Money : " + a + "\n Account Balance : " + Remaining_Balance);
			}
		} catch (MinimumAccountBalance MAB) {
			MAB.printStackTrace();
		}
	}
}