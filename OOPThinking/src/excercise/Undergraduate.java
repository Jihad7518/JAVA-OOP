package Fahim;

public class Undergraduate extends Student{
	
	private int marks = 0;

	public Undergraduate(String name, String id, String course, int marks) {
		super(name, id, course);
		this.marks = marks;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	
	
	
}
