package question05;

public class Telephone {

	protected String phoneNumber;
	protected int fee;

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	void showInfo() {
		System.out.println("Telephone クラスで格納されている電話番号は" + phoneNumber + "で、料金は" + fee + "円です。");
	}

}
