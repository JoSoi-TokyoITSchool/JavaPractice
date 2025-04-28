package lesson14;

/**
 * 携帯電話クラス
 */

public class Phone1403 {

	/**
	 * 名前を検索
	 * @param n
	 */
	public void searchName(String n) {
		System.out.println("アドレス帳から" + n + "さんを検索します。");

	}

	/**
	 * 電話をかける
	 * @param pn
	 */
	public void call(int pn) {
		System.out.println(pn + "へ電話をかけます。");
	}

	public void call2(String pn2) {
		System.out.println(pn2 + "へ電話をかけます。");
	}

}
