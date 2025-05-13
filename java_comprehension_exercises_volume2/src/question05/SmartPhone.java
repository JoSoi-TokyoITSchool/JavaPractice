package question05;

public class SmartPhone extends Telephone {

	private double internetSpeed;

	public double getInternetSpeed() {
		return internetSpeed;
	}

	public void setInternetSpeed(double internetSpeed) {
		this.internetSpeed = internetSpeed;
	}

	void showInfo() {
		super.showInfo();
		System.out.println("SmartPhone クラスで格納されている通信速度は" + internetSpeed + "Mbps です。");
	}

}
