package zuoye2;

public class Person {
	private String name;
	private int age;
	String gender;
	
	public Person(String name,int age,String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		System.out.println("����Ϊ��"+this.name);
		System.out.println("����Ϊ��"+this.age);
		System.out.println("�Ա�Ϊ��"+this.gender);
	}
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
		System.out.println("����Ϊ��"+this.name);
		System.out.println("����Ϊ��"+this.age);;
	}
	
}
