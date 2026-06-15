package chapter16.page27;

//generic method의 상속
public class Parent {
	public<T> void method1(T t) {
		System.out.println(t.toString());
	}
}

class Child extends Parent {

}
