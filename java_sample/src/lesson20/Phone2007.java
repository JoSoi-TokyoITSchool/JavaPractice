package lesson20;

public class Phone2007 {

	private int fee;
	private double data;

	public Phone2007() {
		fee = 0;
		data = 0.0;
		System.out.println("携帯電話を購入しました。");
	}

	public void setPhone(int f, double d) {
		fee = f;
		data = d;
		System.out.println("料金は" + fee + "円でデータ通信量は" + data + "GBです。");

	}

	@Override
	public String toString() {
		String str = "料金" + fee + "データ通信料" + data;
		return str;
	}

}
