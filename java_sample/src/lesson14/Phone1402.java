package lesson14;

public class Phone1402 {

	int fee;

	double data;

	/**
	 * 料金とデータ通信料を表示する
	 */
	public void show() {
		//同じクラス内の他のメソッドを呼び出す
		message();

		System.out.println("携帯電話料金は" + fee + "円です。");
		System.out.println("通信料は" + data + "GBです。");

	}

	/**
	 * メッセージを表示
	 */
	public void message() {
		System.out.println("これから携帯電話の情報を表示します。");
	}

}
