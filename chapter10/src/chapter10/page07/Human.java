package chapter10.page07;

public class Human {
	private String name;
	private int age;

	public Human(){
		this(null,0);
	}

	public Human(String name,int age){
		this.name=name;
		this.age=age;
	}

	public String getName() {
		return name;
	}
	public int getAge(){
		return age;
	}
	public void eat(){
		System.out.println("부모 클래스 먹기");
	}
	public void sleep(){
		System.out.println("부모 클래스 자기");
	}
}
