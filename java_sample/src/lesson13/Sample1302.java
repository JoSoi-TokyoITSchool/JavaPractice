package lesson13;

public class Sample1302 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//携帯電話クラスのオブジェクトを生成
		Phone1302 phone1302 = new Phone1302();

		//人間クラスのオブジェクトを生成
		Human1302 human1302 = new Human1302();

		//人間クラスに名前を代入
		human1302.name = "チョソイ";
		//人間クラスのフィールドphoneに携帯電話のオブジェクトを代入
		human1302.phone = phone1302;
		//携帯料金をfeeに代入
		human1302.phone.fee = 5000;

		//フィールドの値を出力
		System.out.println("料金は" + human1302.phone.fee + "円です。 ");
		System.out.println("持ち主は" + human1302.name + "さんです。 ");

	}

}
