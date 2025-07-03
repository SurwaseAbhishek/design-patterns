package designPatterns.singletonPattern.mainEntryPoints;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import designPatterns.singletonPattern.allPossibleWays.Printer2;

public class DeSerailizationProblem {
	public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException, ClassNotFoundException, InstantiationException {
		Printer2 p1 = Printer2.getInstance();
		System.out.println(p1.hashCode());
		doSearialization(p1);
		Printer2 p2 = doDeserialization();
		System.out.println(p2.hashCode());
		
	}

	private static Printer2 doDeserialization() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Technologies\\AbhishekIT\\Singleton.ser"));
		Printer2 p1 = (Printer2) ois.readObject();
		return p1;
	}

	private static void doSearialization(Printer2 p1) throws FileNotFoundException, IOException {
		ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("D:\\Technologies\\AbhishekIT\\Singleton.ser"));
		oos.writeObject(p1);
	}
}
