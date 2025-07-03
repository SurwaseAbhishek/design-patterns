package designPatterns.singletonPattern.mainEntryPoints;

import designPatterns.singletonPattern.allPossibleWays.threadsToTest.Thread1;
import designPatterns.singletonPattern.allPossibleWays.threadsToTest.Thread2;

public class MultithreadingProblem {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();
	}
}
