
class Vehicle{
	
	void start() {
		System.out.println("Needs to be started with a key.");
	}
	void stop() {
		System.out.println("Needs to be stop by braking");
	}
}
class Car extends Vehicle{
	String Type;
	String Color;
	
	public Car(String type, String color) {
		super();
		Type = type;
		Color = color;
	}

	void useOfCar(){
		System.out.println(Type +" is mostly used for transporting People.");
	}
}
class Truck extends Car{
	
	public Truck(String type, String color) {
		super(type, color);
	}
	void useOfTruck() {
		System.out.println(Type +" truck is used for transporting both.");
	}
	
}
public class InheritanceProgram1 {

	public static void main(String[] args) {
		Car car = new Car("Sedan","Black");
		car.useOfCar();
		car.start();
		car.stop();
		Truck truck = new Truck("Pickup","Red");
		truck.useOfTruck();
		truck.start();
		
		

	}

}
