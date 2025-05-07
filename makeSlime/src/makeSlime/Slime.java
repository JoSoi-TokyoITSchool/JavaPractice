package makeSlime;

public class Slime {

	private String name;
	private int atk;
	private int def;
	private int hp;
	private int mp;

	public Slime(String name) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println(name + "をセットしました。");

	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
		System.out.println(name + "の攻撃力に" + atk + "をセットしました。");
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		System.out.println(name + "の守備力に" + def + "をセットしました。");
		this.def = def;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		System.out.println(name + "のHPに" + hp + "をセットしました。");
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		System.out.println(name + "のMPに" + mp + "をセットしました。");
		this.mp = mp;
	}

	public void appear() {
		System.out.println(name + "が現れた。");
	}

	public void battle() {

		//삼항연산자가 더 이쁠듯ㅎㅎ
		int damage = 0;
		if (atk < def) {
			damage = 0;
		} else {
			damage = atk - def;
		}

		System.out.println(name + "は混乱している。自分に" + damage + "のダメージを与えた");
	}

	public void escape() {
		System.out.println(name + "は逃げた。");
	}

}
