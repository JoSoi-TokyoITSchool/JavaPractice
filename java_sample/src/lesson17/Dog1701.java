package lesson17;

public class Dog1701 {

	private String gender;
	private String breed;

	public Dog1701() {
		this.gender = "オス";
		this.breed = "シェパード";
	}

	public Dog1701(String gender) {
		this.gender = "オス";
	}

	//引数の個数・タイプが同じ場合、区別できないためエラーが発生
	//	public Dog1701(String breed) {
	//			
	//	}

	public Dog1701(String gender, String breed) {
		super();
		this.gender = gender;
		this.breed = breed;

		System.out.println("犬を作成しました。");
	}

	public void show() {
		System.out.println("性別は" + gender + "です。");
		System.out.println("犬種は" + breed + "です。");
	}

}
