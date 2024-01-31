package thuan.java.core.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(20, "Nguyen Van A"));
		list.add(new Student(18, "Nguyen Van X"));
		list.add(new Student(18, "Nguyen Van B"));
		list.add(new Student(18, "Nguyen Van C"));
		list.add(new Student(27, "Nguyen Van F"));
		list.add(new Student(22, "Nguyen Van C"));
		list.add(new Student(21, "Nguyen Van D"));

		Collections.sort(list);
		list.forEach(s -> System.out.println(s));

		System.out.println("---------Sort By Name--------------");
		Collections.sort(list, (s1, s2) -> s1.getName().compareTo(s2.getName()));
		list.forEach(s -> System.out.println(s));
	}
}
