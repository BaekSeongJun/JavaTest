package chapter09.page15;

public class Run {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();

		a1.m = 5;
		a2.m = 6;
		System.out.printf("a1.m = %d, a2.m = %d\n", a1.m, a2.m);

		a1.n = 7;
		a2.n = 8;
		System.out.printf("a1.n = %d, a2.n = %d\n",a1.n, a2.n);

		A.n = 9;
		System.out.printf("a1.n = %d, a2.n = %d\n", a1.n, a2.n);
	}
}
