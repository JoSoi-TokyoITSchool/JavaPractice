package question02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemMain02 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		Member02 memberA = new Member02();
		memberA.name = "田中";
		memberA.age = 20;
		memberA.authority = 1;
		memberA.coupon = new int[2];

		//
		memberA.show();

		//
		Member02 memberB = new Member02();
		Administrator02 adminA = new Administrator02();

		adminA.password = 123;
		adminA.member02 = memberB;

		adminA.member02.name = "加藤";
		adminA.member02.age = 30;
		adminA.member02.authority = 2;
		adminA.member02.coupon = new int[5];

		adminA.changePass(456);

		//
		System.out.println("会員情報を変更します。");
		System.out.println("名前を入力してください。");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String name = reader.readLine();

		System.out.println("年齢を入力してください。");
		int age = Integer.parseInt(reader.readLine());

		adminA.changeStatus(name, age);
		adminA.show();

		//
		adminA.showCoupon(memberA);
		adminA.showCoupon(memberB);

		//
		System.out.println(memberA.name + "さんの権限を確認します。");
		int authority = memberA.confirmation();

		if (authority == 1) {
			System.out.println("権限は一般会員です。");
		} else if (authority == 2) {
			System.out.println("権限は管理者です。");
		} else {
			System.out.println("権限は登録されていません。");
		}

		//
		memberA.changeCoupon(7);
		System.out.println("クーポンの数は" + memberA.coupon.length + "個です。");
	}

}
