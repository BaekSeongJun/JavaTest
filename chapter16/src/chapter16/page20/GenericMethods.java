package chapter16.page20;

public class GenericMethods {
	//generic method type 제한
	// 리턴값 : o 매개변수 : o
	public <T extends String> T method1(T t){
		// t.메서드 Object 10개만 제한이 된다.
		//charAt()같은 메서드를 사용할려면 type 제한을 걸어야한다.
		t.charAt(0);
		int len = t.length();
		System.out.printf("length = %d\n",len);
		return null;
	}
}
