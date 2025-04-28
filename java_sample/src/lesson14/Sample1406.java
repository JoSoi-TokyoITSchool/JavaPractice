package lesson14;

public class Sample1406 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//人間クラスのオブジェクトを生成
		Human1406 satou = new Human1406();

		//戻り値を持つメソッドを呼び出し、戻り値を変数に代入
		String fullNameString = satou.sayFullName("佐藤", "一郎");
		double bmi = satou.calcBmi(70.0, 175.0);

		//四捨五入
		bmi = Math.round(bmi);

		System.out.println(fullNameString + "のBMIは" + bmi + "です。");

		//変数に代入しないと値が消える
		satou.calcBmi(70.0, 175.0);

	}

}
