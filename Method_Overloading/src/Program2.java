import java.util.Scanner;

public class Program2 {

	void sum(int x, float y) {
		System.out.println("Sum of Float and Integer: "+(x+y));
	}
	void sum(float x, int y) {
		System.out.println("Sum of Float and Integer: "+(x+y));
	}
	public static void main(String[] args) {
		Program2 calculate = new Program2();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Integer and Decimal: ");
		calculate.sum(scan.nextInt(), scan.nextFloat());
		System.out.println("Enter Decimal and Integer: ");
		calculate.sum(scan.nextFloat(), scan.nextInt());

	}

}
