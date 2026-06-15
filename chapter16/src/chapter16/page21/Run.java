package chapter16.page21;

public class Run {
	public static void main(String[] args) {
		MyClass mi = new MyClass();

		GenericMethod gm = new GenericMethod();
		gm.method1(mi);

		gm.<MyInterface> method1(new MyInterface() {
			@Override
			public void print() {
				System.out.println("Override 된 함수2");
			}
		});
	}
}
