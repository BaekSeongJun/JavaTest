//같은 패키지
package abc;

public class A {
	//멤변(추천:private)
	public int a;
	protected int b;
	int c;
	private int d;


	 public void print(){
		System.out.printf("a = %d \n", a);
		System.out.printf("b = %d \n", b);
		System.out.printf("c = %d \n", c);
		System.out.printf("d = %d \n", d);
	}
}
//같은 패키지
class B{
	//멤버함수
	public void print(){
		A a1 = new A();
		a1.a = 10;
		a1.b = 10;
		a1.c = 10;
		// a1.d = 10;
		a1.print();
	}
}
