package OOPExcercise;

public class Faculty {
	private String facultyId;
	private String facultyName;
	private String facultyDepartment;
	private double facultySalary;
	
	public String getFacultyId() {
		return facultyId;
	}
	public String getFacultyName() {
		return facultyName;
	}
	public String getFacultyDepartment() {
		return facultyDepartment;
	}
	public double getFacultySalary() {
		return facultySalary;
	}
	public void setFacultyId(String facultyId) {
		this.facultyId = facultyId;
	}
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
	public void setFacultyDepartment(String facultyDepartment) {
		this.facultyDepartment = facultyDepartment;
	}
	public void setFacultySalary(double facultySalary) {
		this.facultySalary = facultySalary;
	}
	
	public Faculty(String facultyId, String facultyName, String facultyDepartment, double facultySalary) {
		super();
		this.facultyId = facultyId;
		this.facultyName = facultyName;
		this.facultyDepartment = facultyDepartment;
		this.facultySalary = facultySalary;
	}
	
	
	
	
	
}
