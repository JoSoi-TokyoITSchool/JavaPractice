package lesson23;

public class Worker2301 {

	protected String job;
	protected String name;
	protected int age;

	protected Worker2301(String job, String name, int age) {
		this.job = job;
		this.name = name;
		this.age = age;

	}

	public void showintroduction() {
		System.out.println("名前は" + name + "年齢は" + age + "歳、職業は" + job + "です。");
	}

	public String getJpb() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public int getAge(int age) {
		return age;
	}

}
