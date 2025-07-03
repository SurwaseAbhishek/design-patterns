package designPatterns.singletonPattern.allPossibleWays;

public class Printer1 {
	private static Printer1 INSTANCE;
	
	private Printer1() {
		System.out.println("do u thing it will work from external ways !! Fool");
	}
	
	public static Printer1 getInstance() {
		if(INSTANCE==null) {
			INSTANCE = new Printer1();
		}
		return INSTANCE;
	}
}
