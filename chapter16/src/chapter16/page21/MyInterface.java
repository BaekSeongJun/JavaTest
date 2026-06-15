package chapter16.page21;

public interface MyInterface {
	//상수
	//생성자x
	//abstract method, default method, private method, static method
	public abstract void print();

}

class GenericMethod {
	public <T extends MyInterface> T method1(T t){
		t.print();
		return null;
	}
}
