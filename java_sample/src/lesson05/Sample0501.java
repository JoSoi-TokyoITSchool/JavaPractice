package lesson05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample0501 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.println("文字列を入力してください。");
		//入力してもらうための部品を作る
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//その部品を使ってユーザーの入力を一行読む
		//readLine()メソッドはテキストを 1 行ずつ読み込むメソッド
		String str = reader.readLine();
		
		System.out.println(str+"が入力されました。");

	}

}
