package lesson14;

/**
 * 人間クラス
 */
public class Human1406 {

	/**
	 * フルネーム取得
	 * @param sei
	 * @param mei
	 * @return フルネーム
	 */
	public String sayFullName(String sei, String mei) {
		String fullName = sei + mei;
		return fullName;
	}

	/**
	 * BMIを計算する
	 * @param weight
	 * @param height
	 * @return　BMI
	 */
	public double calcBmi(double weight, double height) {
		double bmi = weight / ((height / 100) * (height / 100));
		return bmi;
	}

}
