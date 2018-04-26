package cn.hl.ticket;

import java.util.ArrayList;
/**
 * 用递归实现ArrayList数相加
 * @version 1.0
 * @author Beer
 * @description 数组实现道理相同，不同的是数组没有remove方法和.size方法，需要自定义实现。
 * @attention 容器里面存储的是包装类，需要类型转换。注意方法的返回值。
 */
public class Recurrence {
	public static void main(String[] args) {
	   ArrayList<Integer> a=new ArrayList<Integer>();
	   a.add(1);
	   a.add(2);
	   a.add(3);
	   a.add(4);
	   a.add(5);
	   a.add(6);
	   System.out.println(addArrayList(a));
	}
	//下标计数器
	static int index=0;
	public static int addArrayList(ArrayList a) {
		int sum;
		int num2;
		int num1=(int) a.get(index);
		//利用容器的remove方法
		a.remove(index);
		//递归结束的基本条件判断，容器中剩余两个数。
		if(a.size()==2) {
			num2 = (int)a.get(0)+(int)a.get(1);
		}else {
			//递归调用addArrayList，传入移除后的ArrayList。
			num2=addArrayList(a);
		}
	    sum=num1+num2;
		//下标自加
		index++;
		return sum;	
	}
}
