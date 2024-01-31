package thuan.java.core.collections;

public class Student implements Comparable<Student> {
	private int age;
	private String name;

	public Student() {
		this.age = 0;
	}

	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student o) {
		int compareAge = this.age - o.getAge();
		if (compareAge != 0) {
			return compareAge;
		}
		return this.getName().compareTo(o.getName());
	}

}
