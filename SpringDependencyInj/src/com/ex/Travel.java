package com.ex;

public class Travel implements Journey {
Vehicle vehicle;

public void setVehicle(Vehicle vehicle) {
	this.vehicle = vehicle;
}

	public static void main(String[] args) {

		
	}

	@Override
	public void startJourney() {
System.out.println("Started Journey.....");
		vehicle.move();
	}


}
