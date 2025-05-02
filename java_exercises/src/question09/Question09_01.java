package question09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question09_01 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String str = reader.readLine();
		int number = Integer.parseInt(str);

		if (number >= 10) {
			System.out.println("numberの値は10以上です。");
		} else {
			System.out.println("処理を終了します。");
		}

	}

}
