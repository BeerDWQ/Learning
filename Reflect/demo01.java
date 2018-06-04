package cn.hl.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

public class demo01 {
	@Test
	public void newASCon() throws InstantiationException,InvocationTargetException {
		Class<Animal> c=Animal.class;
		try {
			Constructor<Animal> constructor=c.getConstructor(String.class,String.class);
			Animal dog=(Animal) constructor.newInstance("lucky","dog");
			System.out.println(dog);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}
	@Test
	public void getClassParamaters() {
		Class<?> c=HashMap.class;
		System.out.println("CanonicalName:"+c.getCanonicalName());
		System.out.println("Modifiers:"+Modifier.toString(c.getModifiers()));
		TypeVariable[] v=c.getTypeParameters();
		if(v.length!=0) {
			StringBuilder paramater=new StringBuilder("Paramaters:");
			for(TypeVariable t : v) {
				paramater.append(t.getName());
				paramater.append(" ");
			}
			System.out.println(paramater);
		}else {
			System.out.println("no paramaters");
		}	
		Type[] intfs=c.getGenericInterfaces();
		if(intfs.length!=0) {
			StringBuilder interfaces=new StringBuilder("Implements Interfaces:");
			for(Type intf : intfs) {
				interfaces.append(intf.toString());
				interfaces.append(" ");
			}
			System.out.println(interfaces);
		}else {
			System.out.println("no interface");
		}
		
		List<Class> l=new ArrayList<>();
		printAncestor(c,l);
		if(l.size()!=0) {
			StringBuilder inheritance=new StringBuilder("Inheritance:");
			for(Class<?> cl : l) {
				inheritance.append(cl.getCanonicalName());
				inheritance.append(" ");
			}
			System.out.println(inheritance);
		}else {
			System.out.println("no inheritance");
		}
		Annotation[] anns=c.getAnnotations();
		if(anns.length!=0) {
			StringBuilder annotation=new StringBuilder("annotation:");
			for(Annotation ann : anns) {
				annotation.append(ann.toString());
				annotation.append("");
			}
			System.out.println(annotation);
		}else {
			System.out.println("no annotation");
		}
	}
	private void printAncestor(Class<?> c, List<Class> l) {
		Class<?> ancestor=c.getSuperclass();
		if(ancestor!=null) {
			l.add(ancestor);
			printAncestor(ancestor,l);
		}
	}
}
class Animal{
	private String name;
	private String type;
	
	public Animal(String name, String type) {
		this.name=name;
		this.type=type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", type=" + type + "]";
	}
	
}