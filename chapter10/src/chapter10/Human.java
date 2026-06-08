package chapter10;

//Human 클래스(Student, Worker)
public class Human {
	//멤변(공통 : 이름, 나이)
	 private String name;
	 private int age;

	//생성자(디생,매생)
	public Human(){
		this(null,0);
	}

	public Human(String name, int age){
		this.name=name;
		this.age=age;
	}

	//멤함수(겟터, 셋터, 기능, 출력): 먹고, 잠자기
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public void eat(){
		System.out.printf("부모 먹기 stuId = 안됨, name = %s, age = %d\n", name, age);
	}
	public void sleep(){
		System.out.printf("부모 잠자기 stuId = 안됨, name = %s, age = %d\n", name, age);
	}


}
