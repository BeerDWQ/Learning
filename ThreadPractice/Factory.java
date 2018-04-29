package ThreadPractice;
/*
 *创建两个数组
 *提供两种打印方法，线程安全的
 *定义一个flag开关用于切换打印方法
 */
import org.junit.Test;
public class Factory {
	private boolean flag=false;
	static char[] a=new char[26];
	static int[] b=new int[52];
	public static void creatNumber() {
		int j=0;
		for(char i=97;i<123;i++) {
			a[j]=i;
			j++;
		}
	}
	@Test
	public static void creatLetter() {
		for(int i=0;i<52;i++) {
			b[i]=i+1;
		}
//		for(int d : b) {
//			System.out.print(d);
//		}
	}
//	@Test
//	public void test(){
//		for(char c : a) {
//			System.out.println(c);
//		}
//	}
	int i=0;
	public synchronized void printLetter() {
		if(!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}else {
			System.out.print(a[i]);
			flag=false;
			//i++;
			++i;
			notifyAll();
		}
	}
	int j=0;
	public synchronized void printNumber() {
		if(flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}else {
			System.out.print(b[j]+"!"+b[j+1]);
			flag=true;
			j+=2;
			notifyAll();
		}
	}
}
