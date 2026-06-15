package chapter16.page23;

public class Run {
	public static void main(String[] args) {
		Test test = new Test();

		// method1(Goods<A> goods) : A객체만 받는다.
		test.method1(new Goods<A>(new A()));
		// test.method1(new Goods<Object>(new Object()));
		// test.method1(new Goods<B>(new B()));
		// test.method1(new Goods<C>(new C()));
		// test.method1(new Goods<D>(new D()));

		//method2(Goods<?> goods) 모두 받는다.
		test.method2(new Goods<A>(new A()));
		test.method2(new Goods<Object>(new Object()));
		test.method2(new Goods<B>(new B()));
		test.method2(new Goods<C>(new C()));
		test.method2(new Goods<D>(new D()));
		test.method2(new Goods<String>("홍길동"));

		//method3(Goods<? extends B> goods) B객체 이하만 받는다.
		// test.method3(new Goods<A>(new A()));
		// test.method3(new Goods<Object>(new Object()));
		test.method3(new Goods<B>(new B()));
		test.method3(new Goods<C>(new C()));
		test.method3(new Goods<D>(new D()));
		// test.method3(new Goods<String>("홍길동"));

		//method4(Goods<? super B> goods) B객체 이상만 받는다.
		test.method4(new Goods<A>(new A()));
		test.method4(new Goods<Object>(new Object()));
		test.method4(new Goods<B>(new B()));
		// test.method4(new Goods<C>(new C()));
		// test.method4(new Goods<D>(new D()));
		// test.method4(new Goods<String>("홍길동"));
	}
}
