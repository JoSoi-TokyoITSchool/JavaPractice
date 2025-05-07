package makeSlime;

public class Game {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Slime slimeA = new Slime("スライムA");

		slimeA.setAtk(1);
		slimeA.setDef(1);
		slimeA.setHp(5);
		slimeA.setMp(2);

		slimeA.appear();
		slimeA.battle();
		slimeA.escape();

	}

}
