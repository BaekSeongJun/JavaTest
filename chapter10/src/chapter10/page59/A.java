package chapter10.page59;

import java.util.Objects;

public class A {
	//멤버변수
	private int age;
	private String name;

	//생성자
	public A (){
		this(0,null);
	}
	public A(int age, String name) {
		this.age = age;
		this.name = name;
	}

	//멤버함수(겟터, 셋터)
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

	//멤버함수(출력)
	@Override
	public String toString() {
		return "A{" +
			"age=" + age +
			", name='" + name + '\'' +
			'}';
	}

	@Override
	public boolean equals(Object o){
		//부인자타를 확인한다.
		if(!(o instanceof A a)){
			System.out.println("비교할 대상이 잘못되었습니다.");
			return false;
		}
		//2.다운캐스팅
		return this.age == a.age && this.name.equals(a.name);
	}
}
