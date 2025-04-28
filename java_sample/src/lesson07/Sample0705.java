package lesson07;

public class Sample0705 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//配列の初期化
		int[][] score = {{98, 35, 63} ,{76, 57, 88}};
		
		//配列要素の長さを調べる
		System.out.println("試験を受けた人数は"+ score.length + "人です。");
		System.out.println("1人目が受けた試験の数は"+ score[0].length +"種類です。");
		System.out.println("2人目が受けた試験の数は"+ score[0].length +"種類です。");
		
		//配列要素を入力する
		System.out.println("1人目が受けた1つ目の点数は"+ score[0][0] +"点です。");
		System.out.println("2人目が受けた2つ目の点数は"+ score[1][1] +"点です。");
	}

}
