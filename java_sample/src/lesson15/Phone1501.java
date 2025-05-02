package lesson15;

public class Phone1501 {

	private int fee;

	private double data;

	/**
	 * 料金を取得
	 * @return　料金
	 */
	public int getFee() {
		return fee;
	}

	/**
	 * 料金のSetter Method
	 * @param fee 料金
	 */
	public void setFee(int f) {
		//オブジェクトの料金を引数の料金に代入
		if (0 <= f) {
			fee = f;
			System.out.println("料金は" + fee + "円にしました。");
		} else {
			System.out.println(f + "は正しい値ではありません。");
		}
	}

	/**
	 * データ通信量を取得
	 * @return　データ通信量
	 */
	public double getData() {
		return data;
	}

	/**
	 * データ通信量を設定
	 * @param data　通信量
	 */
	public void setData(double d) {
		data = d;

		if (0.0 <= d && d <= 99.99) {
			System.out.println("データ通信量を" + data + "GBにしました。");
		} else {
			System.out.println(d + "は正しい値ではありません。");
		}
	}

}
