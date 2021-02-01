class Variable1{
	int x = 22;
	class Variable2{
		int y = 25;
	}
}
public class InnerClassProgram1 {

	public static void main(String[] args) {
		Variable1 x = new Variable1();
		Variable1.Variable2 y = x.new Variable2();
		System.out.println("Addition of both variable classes: "+ (x.x+y.y));

}
}
