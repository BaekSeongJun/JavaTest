package chapter14.page20;

public class A {
	//멤버변수(인변,정변,상수,인클,정클,정인터페이스)
	//생성자(디생,매생 -> this)
	public A(){
	}
	//멤버 함수(인함, 정함, getter, setter , function, override(hashcode, equals, toString))
	public void abc() throws InterruptedException {
		bcd();
	}
	public void bcd() throws InterruptedException  {
		//반복문을 실행하다가 0.5초씩 정지했다가 실행하는 로직 구현
		for(int i = 0; i < 10; i++){
			System.out.println(i+1);

				Thread.sleep(500);


		}
	}
}
