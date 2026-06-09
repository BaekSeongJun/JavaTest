package chapter13.page03;

public class Run {
	//인스턴스내부클래스 B사용할려고한다.
	//인스턴스멤버변수를 a, b, c를 사용할려고한다.
	public static void main(String[] args) {
		A aobj = new A();
		System.out.println(aobj.a);

		//인스턴스멤버클래스 사용방법
		A.B bobj = aobj.new B();
		bobj.bcd();
		//정적멤버클래스 사용방법
		A.C cobj = new A.C();
		cobj.bcd();
	}
}
