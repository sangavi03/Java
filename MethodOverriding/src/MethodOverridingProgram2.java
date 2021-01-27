class Fruits{
	void taste() {
		System.out.println("Taste varies from fruit to fruit.");
	}
}
class Apple extends Fruits{
	int priceOfFruit;
	
	public Apple(int priceOfFruit) {
		super();
		this.priceOfFruit = priceOfFruit;
	}
	void taste() {
		System.out.println("Red Apple tastes sweet and Green Apple tastes sour.");
	}
	void origin() {
		System.out.println("Apples from Kashmir are famous all over india");
	}
	void price() {
		
		System.out.println("Apple costs: "+ priceOfFruit+ " Rs/-");
	}
}
class Orange extends Apple{
	int priceOfOrange;
	
	public Orange(int priceOfFruit, int priceOfOrange) {
		super(priceOfFruit);
		this.priceOfOrange = priceOfOrange;
	}
	void taste() {
		System.out.println("There are variety of oranges and tastes depends");
	}
	void price() {
	
		System.out.println("Orange costs: "+ priceOfOrange+ " Rs/-");
	}
}
public class MethodOverridingProgram2 {

	public static void main(String[] args) {
		Apple apple = new Apple(55);
		apple.price();
		apple.origin();
		apple.taste();
		Orange orange = new Orange(35,22);
		orange.taste();
		orange.price();
		
	}
}
