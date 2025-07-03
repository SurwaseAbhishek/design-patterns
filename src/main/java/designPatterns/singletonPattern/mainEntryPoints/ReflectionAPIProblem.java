package designPatterns.singletonPattern.mainEntryPoints;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import designPatterns.singletonPattern.allPossibleWays.Printer2;

public class ReflectionAPIProblem {
	public static void main(String[] args) throws InterruptedException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Printer2 p1 = Printer2.getInstance();
		System.out.println(p1.hashCode());
		
		Class cl = Class.forName("designPatterns.singletonPattern.allPossibleWays.Printer2");
		Constructor constructor[]= cl.getDeclaredConstructors();
		constructor[0].setAccessible(true);
		Printer2 p2 = (Printer2)constructor[0].newInstance();
		System.out.println(p2.hashCode());
		
	}
}
