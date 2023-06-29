package Abstraction;

public class HomeAplincesDriver {
	public static void main(String[] args) {
		
		TeleviSion t1 = new TeleviSion();
		
		System.out.println(t1.increaseVolume());
		System.out.println(t1.increaseVolume());
		System.out.println(t1.toString());
		System.out.println(t1.decreaseVolume());
		System.out.println(t1.toString());
	}
}
