package question08;

public class Animal {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		try {
			String[] animals = new String[3];
			animals[1] = "Dolphin";
			animals[2] = "Whale";
			animals[3] = "Penguin";
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("配列の要素を超えています。");
		} finally {

		}

	}

}
