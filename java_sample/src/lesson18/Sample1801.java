package lesson18;

public class Sample1801 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Student1801.showSum();

		Student1801 student1 = new Student1801(1, "まなみ", "女", 19);

		Student1801.showSum();

		Student1801 student2 = new Student1801(1, "けんた", "男", 22);

		Student1801.showSum();

		System.out.println("学生は合計は" + Student1801.sum + "人です。");

		student1.show();
		student2.show();

	}

}
