class Dog{
	void bark() {
		System.out.println("Dogs Bark.");
	}
}
class GoldenRetriever extends Dog{
	void bark() {
		System.out.println("Goldens bark very loud.");
	}
}
class Pomerian extends GoldenRetriever{
	void bark(){
		System.out.println("Pomerians bark very sharp and loud");
	}
}
public class MethodOverridingProgram1 {

	public static void main(String[] args) {
		Pomerian pomerian = new Pomerian();
		pomerian.bark();
		GoldenRetriever golden = new GoldenRetriever();
		golden.bark();
	}

}
