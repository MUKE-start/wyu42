package zuoye2;

public class Person {
	private String name;
	private int age;
	String gender;
	
	public Person(String name,int age,String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		System.out.println("姓名为："+this.name);
		System.out.println("年龄为："+this.age);
		System.out.println("性别为："+this.gender);
	}
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
		System.out.println("姓名为："+this.name);
		System.out.println("年龄为："+this.age);;
	}
	
}
