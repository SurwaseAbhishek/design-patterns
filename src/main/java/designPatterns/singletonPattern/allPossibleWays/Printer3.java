package designPatterns.singletonPattern.allPossibleWays;

import designPatterns.singletonPattern.allPossibleWays.threadsToTest.CommonUtils;

public class Printer3 extends CommonUtils {
	private volatile static Printer3 INSTANCE;

	private Printer3() {
		System.out.println("I m looks twice on console then this is not singleton fool !!!");
	}
	// to prevent this problem we can use synchronized

	/*
	 * 1) Problem of Multi-Threading Problem With synchronized If already INSTANCE
	 * is created then what is use to put lock on method by any thread isn't it
	 * stupidity so that put double null check and synchronized should be on logic
	 * that means u have to use synchronized block it is good practice.
	 * 
	 * Better to have static member variable as volatile always updated value will
	 * be known by thread so that when second thread comes in picture he knows
	 * already instance is instantiated and return already created object
	 */

	public static Printer3 getInstance() throws InterruptedException {
		if (INSTANCE == null) {
			synchronized (Printer3.class) {
				if (INSTANCE == null) {
					INSTANCE = new Printer3();
				}
			}
		}
		return INSTANCE;
	}

	/*
	 * If class indirectly implements Cloneable or Serializable interface this
	 * interfaces are known as Marker interface (My doubt was emty interfaces rae
	 * marker interfaces ) really i don't thing so have will give u that much simple
	 * terminology of course not it is different discussion as per my understanding
	 * it should be conflicting discussion let it be if i do serialization then we
	 * can create duplicate object to prevent that we have to override readResolve()
	 * and throw exception throwing Exception i don't thing so good practice why we
	 * don't send existing created object
	 */

	public Object readResolve() {
		System.out.println("Doing deserialisation great !!! Trying to make me foool !! don't worry I m your great in Java \uD83D\uDE04 !!!");
		return INSTANCE;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		/*
		 * we can throw clone not supported Exception also but good practice is always
		 * return object because we are creating singleton class
		 * throw new CloneNotSupportedException;
		 */
		return INSTANCE;
	}

}
