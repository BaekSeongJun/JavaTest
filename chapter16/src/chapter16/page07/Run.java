package chapter16.page07;


public class Run {
	public static void main(String[] args) {
		//Generic Class를 이용해서 문자열객체를 넣고 가져와서 출력해보자.
		MyClass<String> mc = new MyClass<>("백성준");
		System.out.printf("문자열 : %s\n",mc.getT());

		MyClass<Integer> mc2 = new MyClass<>(10);
		System.out.printf("정수형 객체 : %d\n",mc2.getT());
		// mc2.setT("안녕");


	}
}
