package question08;

public class Question08_01 {

	public static void main(String[] args) {
		// 想定通りの動作（“number は 2 です”の出力）が行われません
		int number = 2;

		if (number >= 1 && number != 2) {
			System.out.println("numberは1以上です");
		} else if (number == 2) {
			System.out.println("numberは2です");
		} else {
			System.out.println("number はそれ以外の数値です");
		}

		System.out.println("処理を終了します");
	}

	/*
	 	if (number == 2) {
			System.out.println("numberは2です");
		} else if (number >= 1) {
			System.out.println("numberは1以上です");
		} else {
			System.out.println("numberはそれ以外の数値です");
		}
	 */

}
