package ThreadPractice;

public class Test extends Thread{
	public static void main(String[] args) {
		Factory factory=new Factory();
		Factory.creatLetter();
		Factory.creatNumber();
		new Thread(new Number(factory)).start();
		new Thread(new Letter(factory)).start();
	}
}
