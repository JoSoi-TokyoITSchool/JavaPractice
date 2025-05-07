package lesson26;

import java.util.ArrayList;
import java.util.List;

public class Sample2602 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		List<Integer> list = new ArrayList<>();

		list.add(45);
		list.add(80);
		list.add(76);
		list.add(56);
		list.add(55);

		//拡張for文
		for (int value : list) {
			System.out.println(value);
		}

		//ラムダ式
		list.stream().filter(i -> i < 4).forEach(i -> System.out.println(i));

	}

}
