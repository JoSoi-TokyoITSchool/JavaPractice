package lesson18;

public class Student1801 {

	//外部で呼び出される場合が多くpublicをよく使う
	public static int sum = 0;

	private int no;

	private String name;

	private String gender;

	private int age;

	public Student1801(int no, String name, String gender, int age) {
		this.no = no;
		this.name = name;
		this.gender = gender;
		this.age = age;

		//static変数sumの値を1加算する
		sum++;

		System.out.println("学生を作成しました。");
	}

	public void show() {
		System.out.println("学生番号は" + no + "番です。");
		System.out.println("氏名は" + name + "です。");
		System.out.println("性別は" + gender + "です。");
		System.out.println("年齢は" + age + "歳です。");

		//インスタンスメソッド内でstatic変数を使える
		System.out.println(sum);
	}

	public static void showSum() {
		System.out.println("学生は合計は" + sum + "人です");
		//staticメソッド内ではインスタンス変数は使えない
		//System.out.println(this.no);
	}

}
