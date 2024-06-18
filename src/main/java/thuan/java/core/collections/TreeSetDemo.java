package thuan.java.core.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
//		treeSet1();
		treeSet2();
	}

	private static void treeSet1() {
		Set<Student> treeSet = new TreeSet<>();
		treeSet.add(new Student(25, "A"));
		treeSet.add(new Student(25, "A"));
		treeSet.add(new Student(20, "A"));
		treeSet.add(new Student(21, "C"));
		treeSet.add(new Student(20, "A"));
		treeSet.add(new Student(22, "ABC"));
		treeSet.add(new Student(23, "KKK"));
		treeSet.add(new Student(23, "XXX"));

		for (Student student : treeSet) {
			System.out.println(student);
		}
	}

	private static void treeSet2() {
		Set<StudentNoCompareable> treeSet = new TreeSet<>();
		treeSet.add(new StudentNoCompareable(25, "A"));
		treeSet.add(new StudentNoCompareable(20, "FFF"));
		treeSet.add(new StudentNoCompareable(21, "C"));
		treeSet.add(new StudentNoCompareable(20, "A"));
		treeSet.add(new StudentNoCompareable(22, "ABC"));
		treeSet.add(new StudentNoCompareable(23, "KKK"));
		treeSet.add(new StudentNoCompareable(23, "XXX"));

		for (StudentNoCompareable student : treeSet) {
			System.out.println(student);
		}
	}

}
