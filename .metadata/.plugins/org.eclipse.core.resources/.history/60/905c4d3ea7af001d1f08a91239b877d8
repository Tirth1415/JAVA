abstract class bank {
	public abstract void getBalance();
}

class bankA extends bank {
	@Override
	public void getBalance() {
		System.out.println("Deposited : $100.");
	}
}

class bankB extends bank {
	@Override
	public void getBalance() {
		System.out.println("Deposited : $150.");
	}
}

class bankC extends bank {
	@Override
	public void getBalance() {
		System.out.println("Deposited : $200.");
	}
}

public class AbstracBank {
	public static void main(String[] args) {
		bankA bankA = new bankA();
		bankB bankB = new bankB();
		bankC bankC = new bankC();

		bankA.getBalance();
		bankB.getBalance();
		bankC.getBalance();
	}
}