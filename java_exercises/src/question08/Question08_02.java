package question08;

public class Question08_02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int[] arr = {88, 62, 54, 76, 45};
		
		int sum = 0;
		
		for(int i = 0 ; i < arr.length ; i++) {
			sum += arr[i];
		}
		
		System.out.println("会員のテストの合計は"+ sum +"点です");

	}

}
