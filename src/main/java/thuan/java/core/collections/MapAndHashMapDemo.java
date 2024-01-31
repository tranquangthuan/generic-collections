package thuan.java.core.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapAndHashMapDemo {

	public static void main(String[] args) {
		System.out.println("------Hash Map with no order--");
		Map<StudentNoCompareable, Integer> hashMap = new HashMap<StudentNoCompareable, Integer>();
		hashMap.put(new StudentNoCompareable(20, "Nguyen Van A"), 1);
		hashMap.put(new StudentNoCompareable(18, "Nguyen Van X"), 2);
		hashMap.put(new StudentNoCompareable(18, "Nguyen Van B"), 3);
		hashMap.put(new StudentNoCompareable(18, "Nguyen Van C"), 4);
		hashMap.put(new StudentNoCompareable(27, "Nguyen Van F"), 5);
		hashMap.put(new StudentNoCompareable(22, "Nguyen Van C"), 6);
		hashMap.put(new StudentNoCompareable(21, "Nguyen Van D"), 7);
		hashMap.forEach((k, v) -> System.out.println("key =" + k + " Value = " + v));

		System.out.println("------Tree Map with order--");
		Map<Student, Integer> treemap = new TreeMap<Student, Integer>();
		treemap.put(new Student(20, "Nguyen Van A"), 1);
		treemap.put(new Student(18, "Nguyen Van X"), 2);
		treemap.put(new Student(18, "Nguyen Van B"), 3);
		treemap.put(new Student(18, "Nguyen Van C"), 4);
		treemap.put(new Student(27, "Nguyen Van F"), 5);
		treemap.put(new Student(22, "Nguyen Van C"), 6);
		treemap.put(new Student(21, "Nguyen Van D"), 7);
		treemap.forEach((k, v) -> System.out.println("key =" + k + " Value = " + v));
	}

}
