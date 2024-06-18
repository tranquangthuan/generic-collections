package thuan.java.core.collections;

import java.util.Objects;

public class Course {
	private String courseCode;
	private String courseTitle;
	private int numOfCredits;

	public Course() {
	}

	public Course(String courseCode, String courseTitle, int numOfCredits) {
		super();
		this.courseCode = courseCode;
		this.courseTitle = courseTitle;
		this.numOfCredits = numOfCredits;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public int getNumOfCredits() {
		return numOfCredits;
	}

	public void setNumOfCredits(int numOfCredits) {
		this.numOfCredits = numOfCredits;
	}

	@Override
	public String toString() {
		return "Course [courseCode=" + courseCode + ", courseTitle=" + courseTitle + ", numOfCredits=" + numOfCredits
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(courseCode, courseTitle, numOfCredits);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(courseCode, other.courseCode) && Objects.equals(courseTitle, other.courseTitle)
				&& numOfCredits == other.numOfCredits;
	}

}
