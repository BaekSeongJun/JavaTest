package chapter13.page03;

public class A {
	//멤버변수(인변, 정변, 상수, 인클, 정클)
	public int a = 3;
	protected int b = 4;
	int c = 5;
	private int d = 6;
	static int sa = 10;
	//멤버변수 : 인스턴스 멤버 클래스 = 인스턴스 멤버 변수라고 생각할 것
	//클래스 = 설계도 => 집 => 객체
	class B {
		//멤버변수
		public int a = 7;
		private int b = 8;
		//생서자
		//멤버변수(겟터, 셋터, 기능, 출력)
		void bcd(){
			System.out.println(a);
			outterFunc();
		}
	}

	static class C {
		void bcd(){
			System.out.println(sa);
			// outterFunc();
		}
	}
	//===========================
	//생성자
	//멤버함수(겟, 셋, 기, 오버(출,해쉬,equals))
	public void outterFunc(){
		System.out.println("바깥쪽함수");
		//지역변수 => 지역변수(상수)
		int lb = 5;
		//지역클래스
		class Local{
				//메변수
				//생성자
				//멤버함수
			public void localBcd(){
				System.out.println("지역클래스" + a);
				System.out.println("지역클래스" + lb);
			}
		}
		Local local = new Local();
		local.localBcd();
		//lb = 10;
	}

}
