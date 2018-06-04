package cn.hl.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Reflect {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		Class<?> p=Class.forName("cn.hl.practice.Person");
		Field f=p.getField("name");
		f.setAccessible(true);
//		for(Field e : f) {
//			System.out.println(e);
//		}
		System.out.println("====================");
		Constructor<?> c=p.getConstructor();
		Object j=c.newInstance();
		Person p1=(Person)j;
		f.set(p1,"Beer" );
		System.out.println(p1.name);
	}
}
class Person {
	public String name;
	protected int age;
	public double height;
	public Person() {}
	public String toString() {
		return "name="+name+"age="+age+"height="+height;
	}
}
