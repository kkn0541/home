package kk.vo;


public class Friend {

	private String name;
	private int age;
	
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Friend() {
		// TODO Auto-generated constructor stub
	}

	public Friend(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Friend [name=" + name + ", age=" + age + "]";
	}

	public Friend(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
}