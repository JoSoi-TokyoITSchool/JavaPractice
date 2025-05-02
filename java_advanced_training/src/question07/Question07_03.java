package question07;

import java.util.Arrays;

public class Question07_03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] num = { 30, 53, 21, 70, 60 };

		//		for (int i = 0; i < num.length - 1; i++) {
		//			for (int j = i + 1; j < num.length; j++) {
		//				if (num[i] > num[j]) {
		//					int tmp = num[i];
		//					num[i] = num[j];
		//					num[j] = tmp;
		//				}
		//			}
		//		}
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));

		System.out.println("ソートが完了しました");

		//		for (int i = 0; i < num.length; i++) {
		//			System.out.println(num[i] + " ");
		//		}

		for (int value : num) {
			System.out.println(value);
		}
	}

}
