package chapter16.page19;

public class A {
}
class B extends A {
}
class C extends B {
}

//generic type에 type제한을 B이하까지만 가능 => Object, A 안됨 // B, C는 됨
class D <T extends B>{
	T t;
	public D(T t){
		this.t = t;
	}
	public T getT(){
		return t;
	}
	public void setT(T t){
		this.t = t;
	}
}