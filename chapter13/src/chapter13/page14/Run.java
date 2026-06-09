package chapter13.page14;

public class Run {
	public static void main(String[] args) {
		//자 = 자객
		B b = new B();
		b.bcd();

		//부 = 자객 (다형성구현)
		C c = new B();
		c.bcd();

		//부 = 부객 (불가능)
		// C c2 = new C();

		//익명클래스 => 익명객체 => 부 = 익명객체
		C c2 = new C() {
			@Override
			public void bcd() {
				System.out.println("부모로부터 구현된 다형성구현입니다.");
				cde();
			}
			public void cde(){
				System.out.println("익명에서 사용자가 정의해서 사용되는 함수");
			}
		};
		c2.bcd();
		// c2.cde();
	}
}
