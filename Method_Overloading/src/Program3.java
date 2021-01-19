import java.util.Scanner;

public class Program3 {
	void sum(int x, int y) {
		System.out.println("Sum of Integers: "+(x+y));
	}
	void sum(int x) {
		System.out.println("Sum of Integer: "+(x));
	}

	public static void main(String[] args) {
		Program3 calculate = new Program3();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		calculate.sum(scan.nextInt(), scan.nextInt());
		
	
	}

}
