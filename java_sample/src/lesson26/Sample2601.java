package lesson26;

import java.util.ArrayList;
import java.util.List;

public class Sample2601 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(3);
		list.add(5);

		System.out.println("数値は" + list.get(0) + "です");
		System.out.println("数値は" + list.get(1) + "です");
		System.out.println("数値は" + list.get(2) + "です");

		//値が繰り下がる
		list.remove(1);

		System.out.println("二つ目: " + list.get(1));

	}

}
