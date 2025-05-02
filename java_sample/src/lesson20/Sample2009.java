package lesson20;

public class Sample2009 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String str1 = "test";

		StringBuilder stringBuilder = new StringBuilder(str1);

		String str2 = stringBuilder.toString();

		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);

		//同じ"test"が含まれている二つの文字列を==(等値比較)での比較
		System.out.println("＝での比較結果: " + (str1 == str2));

		//同じ"test"が含まれている二つの文字列をequals(等価比較)での比較
		System.out.println("equals()での比較結果: " + str1.equals(str2));

	}

}
