package thuan.java.core.collections;

import java.util.HashSet;

public class HashSetCourseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Course> courses = new HashSet<>();
		Course c1 = new Course("J001", "Java SE Programming Essentials", 10);
		Course c2 = new Course("S004", "SQL", 5);
		Course c3 = new Course("S004", "Front End Essentials", 10);
		Course c4 = new Course("S004", "SQL", 51);
		courses.add(c1);
		courses.add(c2);
		courses.add(c3);
		courses.add(c4);
		System.out.println("Size of set: " + courses.size());
	}

}
