package thuan.java.core.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		colorSet();
	}

	private static void colorSet() {
		// HashSet allow value null
		// HashSet doesn't maintain the insertion order
		Set<String> colorSet = new HashSet<String>();
		colorSet.add("Xanh");
		colorSet.add("Do");
		colorSet.add("Tim");
		colorSet.add("Vang");
		colorSet.add("Xanh");
		colorSet.add(null);

		for (String color : colorSet) {
			System.out.println(color);
		}
	}

}
