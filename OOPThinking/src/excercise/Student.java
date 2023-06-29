package Fahim;

public abstract class Student {
	private String name;
	private String id;
	private String course;
	
	public Student(String name, String id, String course) {
		super();
		this.name = name;
		this.id = id;
		this.course = course;
	}

	public Student() {
		super();
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getCourse() {
		return course;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	

}
