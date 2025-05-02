package lesson14;

public class Phone1401 {

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
	public void setFee(int fee) {
		//オブジェクトの料金を引数の料金に代入
		this.fee = fee;
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
	public void setData(double data) {
		this.data = data;
	}

	/**
	 * 料金とデータ通信料を表示する
	 */
	public void show() {
		System.out.println("携帯電話料金は" + fee + "円です。");
		System.out.println("通信料は" + data + "GBです。");
	}

}
