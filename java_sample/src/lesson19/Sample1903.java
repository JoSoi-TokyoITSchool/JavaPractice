package lesson19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample1903 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("整数を比較します。");
		System.out.println("整数を2つ入力してください。");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String str1 = reader.readLine();
		String str2 = reader.readLine();

		//引数を文字列をint型の数値に
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);

		int result = Math.max(num1, num2);

		System.out.println("比較した結果、大きい方は" + result + "です");

	}

}
