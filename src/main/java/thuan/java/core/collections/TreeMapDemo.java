package thuan.java.core.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		treeMap1();
//		treeMap2();
	}

	private static void treeMap1() {
		Map<Student, String> treeMap = new TreeMap<Student, String>();
		treeMap.put(new Student(25, "A"), "SV1");
		treeMap.put(new Student(20, "FFF"), "SV2");
		treeMap.put(new Student(21, "C"), "SV3");
		treeMap.put(new Student(20, "A"), "SV4");
		treeMap.put(new Student(22, "ABC"), "SV5");
		treeMap.put(new Student(23, "KKK"), "SV6");
		treeMap.put(new Student(23, "XXX"), "SV7");
		treeMap.put(new Student(23, "AAA"), "SV8");

		for (Map.Entry<Student, String> entry : treeMap.entrySet()) {
			Student key = entry.getKey();
			String val = entry.getValue();
			System.out.println("Key = " + key + ", value = " + val);
		}
	}

	private static void treeMap2() {
		Map<StudentNoCompareable, String> treeMap = new TreeMap<StudentNoCompareable, String>();
		treeMap.put(new StudentNoCompareable(25, "A"), "SV1");
		treeMap.put(new StudentNoCompareable(20, "FFF"), "SV2");
		treeMap.put(new StudentNoCompareable(21, "C"), "SV3");
		treeMap.put(new StudentNoCompareable(20, "A"), "SV4");
		treeMap.put(new StudentNoCompareable(22, "ABC"), "SV5");
		treeMap.put(new StudentNoCompareable(23, "KKK"), "SV6");
		treeMap.put(new StudentNoCompareable(23, "XXX"), "SV7");
		treeMap.put(new StudentNoCompareable(23, "AAA"), "SV8");

		for (Map.Entry<StudentNoCompareable, String> entry : treeMap.entrySet()) {
			StudentNoCompareable key = entry.getKey();
			String val = entry.getValue();
			System.out.println("Key = " + key + ", value = " + val);
		}
	}

}
