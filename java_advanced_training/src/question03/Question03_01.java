package question03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question03_01 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String str = reader.readLine();
		double num = Double.parseDouble(str);

		System.out.println("サイズが" + num + "の靴を購入します");

		//		int  Integer.parseInt 
		//		byte  Byte.parseByte 
		//		short  Short.parseShort 
		//		long  Long.parseLong 
		//		float  Float.parseFloat 
		//		double  Double.parseDouble 

	}

}
