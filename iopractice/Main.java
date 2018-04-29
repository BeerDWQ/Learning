package cn.hl.iopractice;
/*
 * 测试类
 */
import java.io.File;

public class Main {
	public static void main(String[] args) {
		ListAll list=new ListAll();
		File file=new File("%pathname%");
		list.listAll(file,0);
	}
}
