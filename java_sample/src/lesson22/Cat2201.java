package lesson22;

public class Cat2201 implements BarkingAnimal2201, FourLeggedAnimal2201 {

	@Override
	public void bark() {
		System.out.println("ニャーニャー");
	}

	@Override
	public void walk() {
		System.out.println("猫は歩きました");
	}

}
