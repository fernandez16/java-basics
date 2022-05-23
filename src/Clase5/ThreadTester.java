package Clase5;

public class ThreadTester {
	public static void main(String args[]) {
		HelloRunner r = new HelloRunner();
		Thread t1 = new Thread(r); // PATRON DECORATOR
		t1.start();
		Thread t2 = new Thread(r); // PATRON DECORATOR
		t2.start();
		Thread t3 = new Thread(r); // PATRON DECORATOR
		t3.start();
	}
}

class HelloRunner implements Runnable {
	int i;

	public void run() {
		i = 0;
		while (true) {
			System.out.println("Hello " + i++);
			if (i == 50) {
				break;
			}
		}
	}
}