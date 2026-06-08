package chapter10.page18;

//부모
public class A {
	//멤버변수
	int m = 3;
	//생성자
	public A(){
		this(3);
	}
	public A(int m){
		this.m = m;
	}
	//멤버함수
	public void abc(){
		System.out.println("A 클래스의 함수입니다.");
	}
}
