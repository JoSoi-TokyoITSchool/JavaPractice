package question05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemMain05 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		String phoneNumber;
		int fee;
		double internetSpeed;

		SmartPhone phoneA = new SmartPhone();

		System.out.println("電話番号を入力してください。");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		phoneNumber = reader.readLine();

		System.out.println("料金を入力してください。");

		fee = Integer.parseInt(reader.readLine());

		phoneA.setPhoneNumber(phoneNumber);
		phoneA.setFee(fee);

		System.out.println("通信速度を入力してください。");

		internetSpeed = Integer.parseInt(reader.readLine());
		phoneA.setInternetSpeed(internetSpeed);

		Telephone phoneB = new Telephone();
		phoneB.setPhoneNumber("0123456789");
		phoneB.setFee(9);
		phoneA.showInfo();
		phoneB.showInfo();

		if (phoneA.equals(phoneB)) {
			System.out.println("同じオブジェクトを参照しています。");
		} else {
			System.out.println("違うオブジェクトです。");
		}

	}

}
