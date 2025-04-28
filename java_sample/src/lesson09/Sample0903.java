package lesson09;

public class Sample0903 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] height = { 162, 177, 154, 185 };

		for (int i = 0; i < height.length; i++) {
			System.out.println((i + 1) + "人目の身長は" + height[i] + "です。");
		}

		int[] test = new int[4];
		test[0] = 1;
		test[1] = 2;
		for (int j = 0; j < test.length; j++) {
			System.out.println(test[j]);
		}

		System.out.println(test.length);

	}

}
