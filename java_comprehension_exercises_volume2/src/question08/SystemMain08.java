package question08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemMain08 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("入力してください。");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String input = reader.readLine();

		check(input);

	}

	static void check(String receive) throws NumberFormatException {
		if (receive.isEmpty()) {
			throw new NumberFormatException("文字列が空なので、数値に変換できません。");

		} else {
			System.out.println("入力できています。");
		}

	}

}
