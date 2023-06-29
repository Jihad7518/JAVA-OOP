package OOPExcercise;

import java.util.ArrayList;

public class Course {
	private String courseCode;
	private String courseTitle;
	private double courseCredits;
	private Faculty faculty;
	private ArrayList<Student> studentList;
	
	public String getCourseCode() {
		return courseCode;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	public double getCourseCredits() {
		return courseCredits;
	}
	public Faculty getFaculty() {
		return faculty;
	}
	public ArrayList<Student> getStudentList() {
		return studentList;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public void setCourseCredits(double courseCredits) {
		this.courseCredits = courseCredits;
	}
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	
	public void addStudent(Student s) {
		studentList.add(s);
	}
	public Course(String courseCode, String courseTitle, double courseCredits) {
		super();
		this.courseCode = courseCode;
		this.courseTitle = courseTitle;
		this.courseCredits = courseCredits;
		this.faculty = null;
		this.studentList = new ArrayList<Student>();
	}
	
	@Override
	public String toString() {
		return "Course [Course Code: " + courseCode + ", Course Title: " + courseTitle + ", Course Credits: " + courseCredits
				+ ", Faculty Name: " + faculty.getFacultyName() +  "]";
	}
	
	public void showStudentList() {
		for(Student s:studentList) {
			System.out.println("Student ID: "+ s.getStudentId() + " ; Student Name: " + s.getStudentName() + " ; Student Department: "
		                        + s.getStudentDepartment() + " ; Toatal Credits Completed: " + s.getTotalCreditsCompleted());
		}
	}
	
	
}
