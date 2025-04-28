package lesson08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample0805 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.println("整数を入力してください。");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String str = reader.readLine();
		int num = Integer.parseInt(str);
		
		if (num == 4) {
			System.out.println("4が入力されました。");
		
		}	else if (num == 7){
				System.out.println("7が入力されました。");
		}	else {
				System.out.println("４と７以外の数字が入力されました。");
		}
		
		
		String str1 = "strong";			//리터럴로 선언
		String str2 = "strong";			
		String str3 = new String("strong");	//new 연산자로 선언

		System.out.println(str1 == str2);	//true
		System.out.println(str1 == str3);	//false

	}

}
