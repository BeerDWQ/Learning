package cn.hl.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectMethod {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, SecurityException {
		Class p=Class.forName("cn.hl.practice.person");
		Method[] method=p.getMethods();
		for(Method m : method ) {
			System.out.println(method);
		}
		method=p.getDeclaredMethods();
		for(Method m : method ) {
			System.out.println(method);
		}
		Method m=p.getMethod("String",java.lang.String.class);
		Person1 p1=(Person1) p.getConstructor(null).newInstance();
		m.invoke(p1, "Beer");
		
	}
}
class Person1{
	public void String(String s) {
		System.out.println("122345");
	}
}