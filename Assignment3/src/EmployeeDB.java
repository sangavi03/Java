import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeDB {

	public static void main(String[] args) {

		List<Employee> employee = new ArrayList<Employee>();
		 
		 public boolean addEmployee(Employee e) {
			  return employeeDb.add(e);
			 }
		 public boolean deleteEmp(int empId) {
			boolean isRemoved = False;
			
			Iterator<Employee> it = employeeDb.iterator();
			while(it.hasNext()) {
				Employee emp = it.hasNext();
				if(emp.getEmpId()==empId) {
					isRemoved=True;
					it.remove();
				}
			}
		}
		public String showPaySlip(int empId) {
			  String paySlip = "Invalid employee id";
			  
			  for(Employee e : employeeDb) {
			   if(e.getEmpId()==empId) {
			    paySlip="Payslip for employee id "+ empId + " is "+ e.getEmpSalary();
			    }
			  }
			  return paySlip;
			 }
			 public Employee[] listAll() {
			  Employee[] empArray = new Employee[employeeDb.size()];
			  for(int i =0; i<employeeDb.size();i++)
			   empArray[i]=employeeDb.get(i);
			  return empArray;
			 }
				
	}

	public Object listAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
