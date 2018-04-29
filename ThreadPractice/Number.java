package ThreadPractice;
/*
 *实现Runnable接口
 *控制打印次数
 */
import org.junit.Test;

public class Number implements Runnable{
	private Factory factory;
	public Number(Factory factory) {
		this.factory=factory;
	}
	@Test
	public void run() {
		for(int i=0;i<51;i++) {
			factory.printNumber();
		}
	}
}
