package question02;

public class Member02 {

	String name;
	int age;
	int authority;
	int[] coupon;

	void show() {
		System.out.println("名前は" + name + "です。");
		System.out.println("年齢は" + age + "歳です。");
		introduction();
	}

	void introduction() {
		System.out.println("会員の簡単な紹介をします。");
	}

	int confirmation() {
		return authority;
	}

	int[] changeCoupon(int number) {
		System.out.println("クーポンの数を変更します。");
		coupon = new int[number];
		return coupon;
	}

}
