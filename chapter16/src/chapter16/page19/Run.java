package chapter16.page19;

public class Run {
	public static void main(String[] args) {
		// type 제한을 걸었기 때문에 Object, A불가능
		// D<Object> d = new D<Object>(new Object());
		// D<A> d = new D<A>(new A());

		//type 제한을 B로 걸었기 때문에 B, C 가능
		D<B> d1 = new D<B>(new B());
		D<C> d2 = new D<C>(new C());

		// d1.setT(new Object());
		// d1.setT(new A());
		d1.setT(new B());
		d1.setT(new C());

		// d2.setT(new Object());
		// d2.setT(new A());
		// d2.setT(new B());
		d2.setT(new C());

	}
}
