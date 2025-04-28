package lesson09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample0911 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("何回目の繰り返しで中止しますか？(1~10)");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String str = reader.readLine();
		int num = Integer.parseInt(str);

		for (int i = 1; i <= 10; i++) {

			if (i == num) {
				//スキップ
				continue;
			}
			System.out.println(i + "回繰り返しました。");
		}

	}

}
