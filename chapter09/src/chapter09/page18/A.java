package chapter09.page18;

public class A {
	//멤변(인변:힙,정변==클래스변수:클래스)
	private int a;
	public static int b;
	//생성자(디생,메생,오버로딩,인멤변수를 초기화) => new 할 때(객체를 만들때) 생성이된다.
	//정적멤버변수초기화(정적블록영역) => 클래스가 로더될 때 실행
	static{
		A.b = 10;
		System.out.printf("A클래스에 정적블록 초기화가 진행이 되었습니다. %d\n",A.b);
	}
	//멤버함수(인함, 정함: 기능, 겟터, 셋터, 출력, 오버로딩:시그너처)
	public void abc(){
		this.a = 30;
		A.b = 30;
		A.bcd();
	}
	public static void bcd(){
		// this.a = 10;
		A.b = 20;
		// abc();
	}
}
