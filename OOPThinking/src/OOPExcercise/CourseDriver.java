package OOPExcercise;

public class CourseDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Faculty f1 = new Faculty("DMRH", "Dr. Mohammad Rezaul Haque", "CSE", 120000);
		Faculty f2 = new Faculty("SSZ", "Sakiba Shahnaz", "MPS", 80000);
		
		Student s1 = new Student("2020-3-60-087", "Md. Jihad", "CSE", 23.5);
		Student s2 = new Student("2020-2-70-088", "Shakib Al Hasan", "CSE", 123.5);
		Student s3 = new Student("2020-1-50-067", "Neymar Jr", "EEE", 93.5);
		Student s4 = new Student("2020-0-40-097", "Sharukh Khan", "ECE", 143.5);
		
		Course c1 = new Course("CSE110","OOP",4.5);
		
		c1.setFaculty(f1);
		
		c1.addStudent(s1);
		c1.addStudent(s2);
		c1.addStudent(s3);
		c1.addStudent(s4);
		
		System.out.println(c1.toString());
		c1.showStudentList();
		
	}

}
