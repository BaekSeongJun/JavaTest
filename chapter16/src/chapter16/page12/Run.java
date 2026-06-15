package chapter16.page12;

public class Run {
	public static void main(String[] args) {
		// 제네릭 메소드를 활용하여 출력해보자.
		GenericMethod gm = new GenericMethod();

		String s1 = gm.<String>method1("홍길동");
		int i1 = gm.<Integer>method1(100);
		double d1 = gm.<Double>method1(23.4);

		System.out.printf("String : %s\nInteger : %d\nDouble : %f\n",s1,i1,d1);

		gm.<String,Integer>method2("홍길동",60);
	}
}
