package question12;

public class Dog {

	String name;
	int age;
	int favFood;

	public void showName(String name) {
		// TODO 自動生成されたコンストラクター・スタブ
		System.out.println("名前は" + name + "です");
	}

	public void showAge(int age) {
		System.out.println("年齢は" + age + "です");
	}

	public void showProfile(int age, String food) {
		System.out.println("年齢は" + age + "歳、好きな食べ物は" + food + "です");
	}

}
