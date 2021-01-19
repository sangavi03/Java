import java.util.Scanner;

public class Program1 {
	void sum(int x, int y) {
		System.out.println("Sum of Integers: "+(x+y));
	}
	void sum(float x, float y) {
		System.out.println("Sum of Float: "+(x+y));

}
	public static void main(String[] args) {
		Program1 calculate = new Program1();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Integer numbers: ");
		calculate.sum(scan.nextInt(), scan.nextInt());
		System.out.println("Enter Decimal numbers: ");
		calculate.sum(scan.nextFloat(), scan.nextFloat());
		
	}

}
