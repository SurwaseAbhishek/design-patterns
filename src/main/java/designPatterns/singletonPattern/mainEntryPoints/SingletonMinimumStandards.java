package designPatterns.singletonPattern.mainEntryPoints;

import designPatterns.singletonPattern.allPossibleWays.Printer1;

public class SingletonMinimumStandards {

    public static void main(String[] args) {
		Printer1 p1 = Printer1.getInstance();
		Printer1 p2 = Printer1.getInstance();

		System.out.println("First Object :: "+p1.hashCode()+" :: Second Object :: "+p2.hashCode());
		System.out.println("Validation :: "+(p1==p2));
	}
}
