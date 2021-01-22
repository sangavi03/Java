class Engineer {
	String studentName;
	String course;
	String subject1;
	String subject2;
	double percentage;
	
	public Engineer(String studentName, String course, String subject1, String subject2, double percentage) {
		super();
		this.studentName = studentName;
		this.course = course;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.percentage = percentage;
	}


	void studentInfo() {
		System.out.println("Student Info & Progress:"+"\n"+studentName+"\n"+ course+
				"\n"+ subject1+"\n"+ subject2+"\n"+ percentage);
	}
	
}
class Medical extends Engineer{
	
	String practicals;

	public Medical(String studentName, String course, String subject1, String subject2, double percentage,
			String practicals) {
		super(studentName, course, subject1, subject2, percentage);
		this.practicals = practicals;
	}

	void PracticalsAttended() {
		System.out.println("Attended Practicals: "+practicals);
	}
}
public class ConstructorProgram2 {

	public static void main(String[] args) {
		
		Engineer engineerStudent = new Engineer("Sangavi", "Computers", "Java", "Python", 77.8);
		engineerStudent.studentInfo();
		Medical medicalStudent = new Medical("Lexi", "MBBS", "Anatomy", "Biology", 79.9, "Yes");
		medicalStudent.studentInfo();
		medicalStudent.PracticalsAttended();
	}

}
