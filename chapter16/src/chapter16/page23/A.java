package chapter16.page23;

public class A {
}
class B extends A{
}
class C extends B{
}
class D extends C{
}

class Goods<T>{
	T t;
	public Goods(T t){
		this.t = t;
	}
	public T getT(){
		return t;
	}
	public void setT(T t){
		this.t = t;
	}
}

class Test{
	//멤버함수 매개변수 제네릭타입 제한
	public void method1(Goods<A> goods){}

	public void method2(Goods<?> goods){}

	public void method3(Goods<? extends B> goods){}

	public void method4(Goods<? super B> goods){}
}
