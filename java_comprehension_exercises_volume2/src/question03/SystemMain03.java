package question03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemMain03 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		Student studentA = new Student();

		System.out.println("studentA の名前を入力してください。");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String name = reader.readLine();
		studentA.setName(name);

		System.out.println("studentA の年齢を入力してください。");

		int age = Integer.parseInt(reader.readLine());
		studentA.setAge(age);

		//
		Student studentB = new Student("キム", 20);

		System.out.println("studentA の名前は" + studentA.getName()
				+ "、年齢は" + studentA.getAge() + "歳です");
		System.out.println("studentB の名前は" + studentB.getName()
				+ "、年齢は" + studentB.getAge() + "歳です");
		System.out.println("Student クラスで生成したオブジェクトの数は" + Student.getTotalStudent() + "です。");

		//
		Teacher teacherA = new Teacher();
		System.out.println("teacherA の名前を入力してください。");

		String teacherName = reader.readLine();

		System.out.println("teacherA の年齢を入力してください。");

		int teacherAge = Integer.parseInt(reader.readLine());

		System.out.println("teacherA の住所を入力してください。");

		String teacherAddress = reader.readLine();

		teacherA.setTeacherInfo(teacherName, teacherAge, teacherAddress);

		System.out.println("teacherA の住所は" + teacherA.getAddress() + "です。");

	}

}
