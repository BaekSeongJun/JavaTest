package chapter10.page10;

public class Run {
	public static void main(String[] args) {
		//부모객체참조변수는 모든 자식의 번지를 저장한다.(upcasting 발생이된다.)
		//이말은 자식의 번지영역에서(부모영역만 있으면 업캐스팅이 이루어진다.)
		A a1 = new A();
		A a2 = new B(); //upcasting(자동형변환)
		A a3 = new C(); //upcasting
		A a4 = new D();

		B b1 = new B();
		B b2 = new C();
		B b3 = new D();
		// B b4 = new A();
		B b5 = (B)a2; //down casting (강제형변환)

		C c1 = new C();
		C c2 = (C)b2;


	}
}
