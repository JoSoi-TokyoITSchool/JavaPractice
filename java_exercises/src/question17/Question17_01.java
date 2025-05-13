package question17;

public class Question17_01 {

	//staticを使うことでオブジェクト生成なしで使える

	static int num;

	static void message() {
		System.out.println("メッセージを表示します");
		System.out.println("の初期値は" + num + "です");
	}

	public static void main(String[] args) {
		message();
	}

}
