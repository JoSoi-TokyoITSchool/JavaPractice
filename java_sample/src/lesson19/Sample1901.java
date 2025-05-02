package lesson19;

public class Sample1901 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//同じアドレスがどうかを"=="で判定

		String mailAddress = "hanako@example.com";

		String mailAddress2 = "hanako@example.com";

		String mailAddress3 = new String("hanako@example.com");

		/*
		基本型変数の値を別の変数へ代入することを値渡しと呼びます。 
		参照型変数の値(オブジェクトの参照情報)を別の変数に代入することを 
		参照渡しと呼びます。 
		*/
		System.out.println(mailAddress == mailAddress2);
		System.out.println(mailAddress == mailAddress3);
		System.out.println(mailAddress.equals(mailAddress3));

		String userName = mailAddress.substring(0, mailAddress.indexOf("@"));

		//2行で
		int indexOfAt = mailAddress.indexOf("@");
		//substring(int beginIndex, int endIndex)
		String userName2 = mailAddress.substring(0, indexOfAt);
		String userName3 = mailAddress.substring(indexOfAt + 1);

		System.out.println("メールアドレス: " + mailAddress);
		System.out.println("ユーザー名: " + userName);
		System.out.println("ユーザー名: " + userName2);
		System.out.println("ユーザー名: " + userName3);

		String test1 = "ABCDE";
		String lowerCase = test1.toLowerCase();
		System.out.println(lowerCase);

	}

}
