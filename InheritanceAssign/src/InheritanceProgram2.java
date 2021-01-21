class Mobile{

	String color;
	double screenSize;
	String chargingType;
	public Mobile(String color, double screenSize, String chargingType) {
		super();
		this.color = color;
		this.screenSize = screenSize;
		this.chargingType = chargingType;
	}
}
class Iphone extends Mobile{
	 String security;
	
	public Iphone(String color, double screenSize, String chargingType, String security) {
		super(color, screenSize, chargingType);
		this.security = security;
	}
	void features() {
		System.out.println(color+" Iphone has a screen of "+screenSize+ " and can be charged "
				+chargingType +". With security feature "+security);
	}
	
}
class Android extends Iphone{

	public Android(String color, double screenSize, String chargingType, String security) {
		super(color, screenSize, chargingType, security);
	}
	void features() {
		System.out.println(color+" Android has a screen of "+screenSize+ " and can be charged with "
				+chargingType +". With security feature "+security);
	}
	
}
public class InheritanceProgram2 {

	public static void main(String[] args) {

		Iphone iphone = new Iphone("RoseGold", 5.7, "wireless", "faceID");
		iphone.features();
		Android android = new Android("Black", 4.5, "wire", "passcode");
		android.features();
	}

}
