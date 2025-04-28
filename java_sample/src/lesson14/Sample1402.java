package lesson14;

public class Sample1402 {

	public static void main(String[] args) {

		//携帯電話クラスのオブジェクトを生成
		Phone1402 phone1402 = new Phone1402();

		//フィールドに値を代入
		phone1402.fee = 5000;
		phone1402.data = 2.0;

		//料金とデータ通信料を表示する
		phone1402.show();

	}

}
