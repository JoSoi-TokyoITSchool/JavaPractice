package question27;

import java.util.ArrayList;
import java.util.List;

public class Question27_01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//		String[] fruits = new String[3];
		//
		//		fruits[0] = "みかん";
		//		fruits[1] = "ぶどう";
		//		fruits[2] = "いちご";
		//
		//		System.out.println(fruits[0]);
		//		System.out.println(fruits[1]);
		//		System.out.println(fruits[2]);

		List<String> arr = new ArrayList<String>();
		arr.add("みかん");
		arr.add("ぶどう");
		arr.add("いちご");

		for (String fruit : arr) {
			System.out.println(fruit);
		}

	}

}
