class ABCD extends Thread {
	public void run() {
		System.out.println("Thread is Running.........");
	}
}

public class Interface_Iimplementing_Runnable {
	public static void main(String[] args) {
		ABCD a = new ABCD();
		a.start();
	}
}