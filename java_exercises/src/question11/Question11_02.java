package question11;

public class Question11_02 {

	public static void main(String[] args) {

		Cat cat = new Cat();

		cat.height = 52.3;
		cat.weight = 4.8;
		cat.favFood = "ささみ";

		System.out.println("身長は" + cat.height + "です");
		System.out.println("体重は" + cat.weight + "です");
		System.out.println("好きな食べ物は" + cat.favFood + "です");
	}

}
