interface Math{
	int a = 10;
	int b = 20;
	int c = 30;
	
	void display();
}
class Addition implements Math{
	public void display() {
		System.out.println("Addition of a, b, c: "+ (a+b+c));
	}
}
class Subtraction implements Math{
	public void display() {
		System.out.println("Subtraction of a, b, c: "+ ((a+b)-c));
	}
}
public class InterfaceProgram2 {

	public static void main(String[] args) {

		Addition add = new Addition();
		add.display();
		Subtraction subtract = new Subtraction();
		subtract.display();
	}

}
