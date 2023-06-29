package OOPExcercise;

public class Student {
	private String studentId;
	private String studentName;
	private String studentDepartment;
	private double totalCreditsCompleted;
	
	public String getStudentId() {
		return studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public String getStudentDepartment() {
		return studentDepartment;
	}
	public double getTotalCreditsCompleted() {
		return totalCreditsCompleted;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setStudentDepartment(String studentDepartment) {
		this.studentDepartment = studentDepartment;
	}
	public void setTotalCreditsCompleted(double totalCreditsCompleted) {
		this.totalCreditsCompleted = totalCreditsCompleted;
	}
	
	public Student(String studentId, String studentName, String studentDepartment, double totalCreditsCompleted) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentDepartment = studentDepartment;
		this.totalCreditsCompleted = totalCreditsCompleted;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentDepartment="
				+ studentDepartment + ", totalCreditsCompleted=" + totalCreditsCompleted + "]";
	}
	
	
	
	
	
	
}
