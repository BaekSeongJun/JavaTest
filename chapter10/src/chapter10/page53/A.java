package chapter10.page53;

public class A extends Object{
	//멤변
	int a;
	//디생
	public A() {
		this(0);
	}
	//매생
	public A(int a) {
		super();
		this.a = a;
		System.out.println("A 생성자");
	}

	@Override
	public String toString() {
		return "A [ a=" + a + " ]";
	}
}
