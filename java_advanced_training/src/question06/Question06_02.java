package question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question06_02 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("整数を入力してください。");
		String str = br.readLine();
		int num = Integer.parseInt(str);

		if (num % 10 == 0) {
			System.out.println(num + "は10の倍数です。");
		} else {
			System.out.println(num + "は10の倍数ではありません。");
		}

	}

}
