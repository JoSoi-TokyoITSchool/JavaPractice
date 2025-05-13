package question26;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class question26 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		try {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("数値を入力してください");
			String str = br.readLine();
			Integer.parseInt(str);

			//IO = Input&Output
		} catch (Exception e) {
			System.out.println("例外が発生しました");

		} finally {
			System.out.println("システムを終了します");
		}

	}

}
