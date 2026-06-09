package chapter13.page16;

public class Run {
	public static void main(String[] args) {
		C c = new C();
		A a = new A() {
			@Override
			public void abc() {
				System.out.println("다형성구현3");
			}
		};
		c.cde(a);
	}
}
