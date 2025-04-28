package lesson08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample0803 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.println("整数を入力してください。");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String str = reader.readLine();
		int res = Integer.parseInt(str);
		
		//if文は{}なくでも動く、ただ結果は一行だけ実行される
		if (res > 4) { //①変数resが4より大きい　：true
			if (res <=10) {
				System.out.println(res + "は4より大きく10以下の文字です。");
			}
			//resの値が5だった場合、以下の処理を実行
		}
		System.out.println("システムを終了します。");

	}

}
