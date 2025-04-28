package lesson13;

public class Sample1301 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//携帯電話クラスのオブジェクトを生成
		Phone1301 phone1301 = new Phone1301();

		//フィールドに値を代入
		phone1301.fee = 5000;
		phone1301.data = 5000;

		//出力
		System.out.println("料金は" + phone1301.fee + "円です。");
		System.out.println("通信料は" + phone1301.data + "GBです");

	}

}
