package lesson19;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Sample1905 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Date date = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		System.out.println("今日の日付を表記します。");
		System.out.println(sdf.format(date));
		System.out.println(sdf2.format(date));

	}

}
