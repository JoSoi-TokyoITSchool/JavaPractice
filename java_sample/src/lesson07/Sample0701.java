package lesson07;

public class Sample0701 {
	public static void main(String[] args) {
		
		//配列の初期化(宣言して作成して代入)
		//宣言
		int[] height;
		
		//作成
		height =  new int[4];
		
		//代入
		height[0] = 160;
		height[1] = 180;
		height[2] = 170;
		height[3] = 155;
		
		System.out.println("1人目の身長は" + height[0] + "です。");
		
		for (int i = 0 ; i<height.length ; i++) {
		System.out.println((i+1) + "人目の身長は" + height[i] + "です。");
		}
	}
}
