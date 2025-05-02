package lesson20;

public class SmartPhone2005 extends Phone2005 {

	private int inch;

	public SmartPhone2005() {
		System.out.println("スマートフォンを生成しました。");
		inch = 5;
	}

	@Override
	public void show() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("液晶画面のサイズは" + inch + "インチです。");
	}

}
