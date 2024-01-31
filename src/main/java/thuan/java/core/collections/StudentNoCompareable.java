package thuan.java.core.collections;

public class StudentNoCompareable {
	private int age;
	private String name;

	public StudentNoCompareable() {
		this.age = 0;
	}

	public StudentNoCompareable(int age, String name) {
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

}
