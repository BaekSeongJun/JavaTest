package chapter13.page19;

import chapter13.page14.B;

public class A {
	//정적 interface B
	static interface B {
		//상수, 추상메서드
		public abstract void bcd();
	}
}

class C implements A.B {
	@Override
	public void bcd() {
		System.out.println("다형성구현2");
	}
}
