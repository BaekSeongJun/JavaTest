package chapter07.page15;

public class ATest {
	public static void main(String[] args) {
		A a = new A();
		a.print();
		a.print(10);
		a.print(10.0);
		a.print(10, 10.5);
		a.print(10.5, 10);
		a.print("백성준",10);
	}
}
