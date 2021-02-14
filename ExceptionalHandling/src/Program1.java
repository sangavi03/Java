
public class Program1 {

	public static void main(String args[]) {
		try {
			int a[] = new int[2];
			System.out.println("Access element three :" + a[3]);
			//System.out.println("Access element three :" + a[0]);
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Exception thrown  :" + e);
		}
		System.out.println("Out of the block");
	}
}