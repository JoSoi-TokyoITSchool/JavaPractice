package question03;

public class Student {

	private String name;
	private int age;
	static int totalStudent;

	public Student() {
		totalStudent++;
	}

	public Student(String name, int age) {
		this();
		this.name = name;
		this.age = age;
	}

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	void setAge(int age) {
		this.age = age;
	}

	int getAge() {
		return age;
	}

	static void setTotalStudent(int totalStudent) {
		//totalStudent = totalStudent;
	}

	static int getTotalStudent() {
		return totalStudent;
	}

}
