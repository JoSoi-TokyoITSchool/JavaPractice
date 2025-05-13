package question26;

public class Question26_01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		try {
			String str = "こんにちは";
			int num = Integer.parseInt(str);
			System.out.println("変換したら" + num + "になりました");

		} catch (NumberFormatException e) {
			System.out.println("列外が発生しました。2");
		} catch (Exception e) {
			System.out.println("列外が発生しました。");

		} finally {

		}

	}

}
