package chapter10.page53;

public class Run {
	public static void main(String[] args) {
		Object o  = new A();
		System.out.printf("o.toString = %s\n",o.toString());

		//문자열 비교
		String name1 = "홍길동";
		String name2 = new String("홍길동");

		System.out.printf("String name1 = %d\n",System.identityHashCode(name1));
		System.out.printf("String name2 = %d\n",System.identityHashCode(name2));

		if(name1.equals(name2)){
			System.out.println("내용이 같다.");
		}else{
			System.out.println("내용이 틀리다.");
		}
	}
}
