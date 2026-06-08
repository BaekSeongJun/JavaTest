package chapter10.page59;

public class Run {
	public static void main(String[] args) {
		// 두개의 A객체를 만든다.
		A a1 = new A(22,"백성준");
		A a2 = new A(28,"백성준");

		System.out.printf("a1 = %s\n",a1.toString());
		System.out.printf("a2 = %s\n",a2.toString());

		if(a1.equals(a2)){
			System.out.println("내용물이 같아");
		}else{
			System.out.println("내용물이 틀려");
		}
	}
}
