package lesson14;

public class Sample1401 {

	public static void main(String[] args) {

		//携帯電話クラスのオブジェクトを生成
		Phone1401 phone1401 = new Phone1401();

		//フィールドに値を代入
		phone1401.fee = 5000;
		phone1401.data = 2.0;

		//料金とデータ通信料を表示する
		phone1401.show();

	}

}
