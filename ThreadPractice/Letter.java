package ThreadPractice;

import org.junit.Test;

public class Letter implements Runnable{
	private Factory factory;
	public Letter(Factory factory) {
		this.factory=factory;
	}
	@Test
	public void run() {
		for(int i=0;i<52;i++) {
			factory.printLetter();
		}
	}
}
