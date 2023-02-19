class ABC extends Thread{
	public void run() {
		System.out.println("Welcome to ABC Class.");
	}
}
public class Extends_Thread {
	public static void main(String[] args) {
		ABC abc = new ABC();
		abc.start();
	}
}