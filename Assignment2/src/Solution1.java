class Calculator{
static double powerInt(int num1, int num2)
{
	return Math.pow(num1, num2);
}
static double powerDouble(double num1,int num2)
{
    return Math.pow(num1,num2);
}
}
public class Solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Calculator.powerDouble(12.0, 22));
	    System.out.println(Calculator.powerInt(15,2));
	}

}
