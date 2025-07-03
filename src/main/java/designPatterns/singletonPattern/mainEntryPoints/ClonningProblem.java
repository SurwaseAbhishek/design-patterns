package designPatterns.singletonPattern.mainEntryPoints;

import designPatterns.singletonPattern.allPossibleWays.Printer3;

public class ClonningProblem {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InterruptedException, CloneNotSupportedException {
		Printer3 p1 = Printer3.getInstance();
		System.out.println(p1.hashCode());
		Printer3 p2 = (Printer3) p1.clone();
		System.out.println(p2.hashCode());
	}   
}
