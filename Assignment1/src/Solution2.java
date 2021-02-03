import java.util.Scanner;

class Reverse{
	class Number{
		void reverseNumber() {
			int x=0, num =0;
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter a number to reverse: ");
			x =scan.nextInt();
			while(x != 0) {
				num = num*10;
				num = num+x%10;
				x = x/10;
			}
			System.out.println("Reversed Number is: "+num);
			
		}
	}
}
public class Solution2 {

	public static void main(String[] args) {
 
		Reverse reverse = new Reverse();
		Reverse.Number reverse2 = reverse.new Number();
		reverse2.reverseNumber();
	}

}
