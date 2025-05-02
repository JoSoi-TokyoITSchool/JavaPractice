package lesson16;

public class Sample1601 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Human1601 human1 = new Human1601();

		//実引数を渡してメソッドを呼び出す
		human1.setProfile("田中太郎");
		human1.setProfile(22);

		//人間クラスのオブジェクトを生成
		Human1601 human2 = new Human1601();

		//複数の引数を持つメソッドを呼び出す
		human2.setProfile("渡辺花子", 21);
		human2.showProfile("渡辺花子", 21);

	}

}
