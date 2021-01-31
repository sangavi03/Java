abstract class Bank{
	int interest;
	
	public Bank(int interest) {
		super();
		this.interest = interest;
	}
	abstract void loan();
	void creditCar() {
		System.out.println("Credit Card interest rate is: "+interest+"% if approved");
	}
	}
class AxisBank extends Bank{
	
	public AxisBank(int interest) {
		super(interest);
		// TODO Auto-generated constructor stub
	}
	void loan() {
		System.out.println("Axis Bank approves loans based on credit score above 500.");
	}
	void creditCard() {
		System.out.println("Credit Card interest rate is: "+interest+"% if approved");
	}
}
public class AbstractProgram1 {

	public static void main(String[] args) {

		AxisBank axis = new AxisBank(4);
		axis.loan();
		axis.creditCar();
	}

}
