class ABCDE implements Runnable {
	public void run() {
		System.out.println("Hello");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Java");
		System.out.println(Thread.currentThread());
	}

	void m1() {
		System.out.println("M1 Method.");
	}
}

public class Thread_Excuation {
	public static void main(String[] args) {
		ABCDE a = new ABCDE();
		Thread t = new Thread(a, "Chlid Thread");
		t.start();
		System.out.println("Number of Active Threads : " + Thread.activeCount());
		a.m1();
	}
}