package question04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SystemMain04 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		String phoneNumber = "12-3456-7890";
		String message = "今日は晴れです。";
		String annotation = "ただし、午後からの降水確率は 70%です。";

		System.out.println("1 文字ずつ表示します。");

		for (int i = 0; i < message.length(); i++) {
			System.out.println(message.substring(i, i + 1));
		}

		//
		System.out.println("文字列を連携します。");

		StringBuilder builder = new StringBuilder(message);
		String sconcat = message.concat(annotation);

		System.out.println("連結した文字列：" + sconcat);

		//
		System.out.println("ランダムな数を表示します。");

		double number = Math.random();
		System.out.println(number);

		//
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM月ddE曜日");
		System.out.println("今日の日付を表示します。");
		System.out.println(sdf.format(date));

		System.out.println("電話番号を入力してください");
		System.out.println("入力例:xx-xxxx-xxxx");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();

		Pattern p = Pattern.compile("^[0-9]{2}-[0-9]{4}-[0-9]{4}$");
		Matcher m = p.matcher(str);
		boolean result = m.find();

		if (result) {
			System.out.println("パターンと一致しています。");
		} else {
			System.out.println("正しい番号ではありません。");
		}

	}

}
