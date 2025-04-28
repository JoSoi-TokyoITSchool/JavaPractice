package lesson06;

public class Sample0606 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		double dnum1 = 170.5;
		double dnum2 = 65.3;
		
		System.out.println("身長は" + dnum1 + "cmです");
		System.out.println("体重は" + dnum2 + "kgです");
		
		//このままだと代入不可
//		int inum1 = dnum1;
//		int inum2 = dnum2;
		int inum1 = (int) dnum1;
		int inum2 = (int) dnum2;
		
		System.out.println("身長は" + inum1 + "cmです");
		System.out.println("体重は" + inum2 + "kgです");

	}

}
