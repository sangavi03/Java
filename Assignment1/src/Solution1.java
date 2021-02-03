class Phone {
	class Apple {
		void numberOfPhones() {
			for(int i=1; i<=10; i++) {
				System.out.println("Number of Apple Phones: "+ i);
			}
		}
		
	}
}
public class Solution1 {

	public static void main(String[] args) {

		Phone phone = new Phone();
		Phone.Apple apple = phone.new Apple();
		apple.numberOfPhones();
		
	}

}
