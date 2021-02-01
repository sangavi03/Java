interface Animal{
	void eat();
	void travel();
}
abstract class Bird implements Animal{
	public void eat() {
		System.out.println("Birds eat small insects or grains as food.");
	}
	public void travel() {
		System.out.println("Birds fly.");
	}
	
}
class Peacock extends Bird{
	public void eat() {
		System.out.println("Peacock eats insects for food.");
	}
	public void travel() {
		System.out.println("Peacock is a bird but doesn't fly.");
	}
}
abstract class Mammal implements Animal{
	public void eat() {
		System.out.println("Mammals eat plants or other animals");
	}
	public void travel() {
		System.out.println("Mammals travel on land or water");
	}
}
class Whale extends Mammal{
	public void eat() {
		System.out.println("Whale eats fishes or other living creature");
	}
	public void travel() {
		System.out.println("Whale lives and travels by water");
	}
}
public class InterfaceProgram1 {

	public static void main(String[] args) {
		Peacock peacock = new Peacock(); 
			peacock.eat();
			peacock.travel();
		Whale mammal = new Whale();
		mammal.eat();
		mammal.travel();
		
	}

}
