package cn.hl.ticket;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
 * 迭代器的小练习：把ArrayList里的数据添加到一个数组里
 * 发现了迭代器用法的小问题
 * 初始化的位置不正确会报错
 */
public class IteratorProblems {
	public static void main(String[] args) {
		   List a=new ArrayList();
		   /*
		    * Iterator it=a.iterator();
		    * 迭代器写在上边报错
		    * Exception in thread "main" java.util.ConcurrentModificationException
			*at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:901)
			*at java.util.ArrayList$Itr.next(ArrayList.java:851)
			*at cn.hl.ticket.IteratorProblems.main(IteratorProblems.java:11)
		    */ 
		   a.add(1);
		   a.add(2);
		   a.add(3);
		   a.add(4);
		   a.add(5);
		   a.add(6);
		   Iterator it=a.iterator();
//		   while (it.hasNext()) {
//			   System.out.println(it.next());
//		}
		   int i=0;
		   int[] a2=new int[6];
		   while(it.hasNext()) {
			  int a1=(int)it.next();
			  a2[i]=a1;
			  i++;
			  if(a1==2) {
				it.remove();  
			  }
		   }
		   for(int c : a2) {
			   System.out.println(c);
		   }
	}
}
