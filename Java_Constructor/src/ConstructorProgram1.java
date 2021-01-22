class Student{
	String name;
	int studentId;
	String studentEmail;
	
	public Student(String name, int studentId, String studentEmail) {
		super();
		this.name = name;
		this.studentId = studentId;
		this.studentEmail = studentEmail;
	}
	
	void studentDetails() {
		System.out.println("Student Info:" + "\n" + name + "\n"+ studentId +
				"\n"+ studentEmail);
	}
}
public class ConstructorProgram1 {

	public static void main(String[] args) {

		Student studentinfo = new Student("Sangavi", 12345, "sangavi@java.com");
		studentinfo.studentDetails();
	}

}
