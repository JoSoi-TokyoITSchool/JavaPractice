package lesson22;

public class Sample2201 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Dog2201 dog = new Dog2201();
		dog.bark();
		dog.walk();

		Cat2201 cat = new Cat2201();
		cat.bark();
		cat.walk();

		System.out.println(dog instanceof Dog2201);
		System.out.println(dog instanceof FourLeggedAnimal2201);

		if (dog instanceof Dog2201) {

			System.out.println("犬です。");

		}

	}

}
