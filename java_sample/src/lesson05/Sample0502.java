package lesson05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample0502 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.println("整数を入力してください。");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//readLineはString識別子だけ
		String str = reader.readLine();
		
		//入力した文字列を数値に変換
		int num = Integer.parseInt(str);
		System.out.println(num + "が入力されました。");
		
		String str2 = reader.readLine();
		int num2 = Integer.parseInt(str2);
		
		System.out.println(num2 + "が入力されました。");
		
		//整数でない値を入力すると、NumberFormatException発生
		//Javaで文字列を数値型に変換する際に、
		//変換できない文字列が与えられた場合に発生する例外
		
		
		String str3 = "123";
		System.out.println(str3+4);
		int num3 =  Integer.parseInt(str3);
		System.out.println(num3+4);


	}

}
