import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {
	String name;
	Date dateOfBirth;
	String department;
	String designation;
	Double salary;

	public Employee(String string, String string2, String string3, int i) {

	}

	public Employee(String name, Date dateOfBirth, String department, String designation, Double salary) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.department = department;
		this.designation = designation;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		//SERIALIZE
		Employee employee = new Employee("Sangavi", "IT", "SoftwareDeveloper", 40000);
		FileOutputStream filename = new FileOutputStream("C:/Users/sanga/OneDrive/Documents/JavaPrograms/Assignment5/EmployeeFile.txt");
		ObjectOutputStream out = new ObjectOutputStream(filename);
		
		out.writeObject(employee);
		out.flush();
		out.close();
		
		//DESERIALIZE
		FileInputStream filename1 = new FileInputStream("C:/Users/sanga/OneDrive/Documents/JavaPrograms/Assignment5/EmployeeFile.txt");
		ObjectInputStream in = new ObjectInputStream(filename1);
		Employee employee1 = (Employee)in.readObject();
		System.out.println( "EmployeeName = " + employee1.name + " EmployeeDept = " + employee1.department + "  EmployeeRole = " + employee1.designation + "  EmployeeSalary = " + employee1.getSalary());
		in.close();
		
		
		
	}
}
