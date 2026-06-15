package chapter16.page12;

public class GenericMethod {
	//멤버함수 getter setter function Override(hascode equals toString)

	//return값 : * , 매개변수 : *
	public <T> T method1 (T t) {
		return t;
	}

	//return 값 : x, 매개변수 : *(타입 2개)
	public <K,V> Object method2 (K k, V v){
		System.out.print(k.toString() + "\t");
		System.out.println(v.toString());
		return null;
	}

}
