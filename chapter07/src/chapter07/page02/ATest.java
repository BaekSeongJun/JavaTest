package chapter07.page02;

public class ATest {
	public static void main(String[] args) {
		//1.A 객체를 만든다.
		A a = new A(3,4);

		//2 A라는 객체 m 멤버변수를 10으로 변경하시오.
		a.setM(10);

		//2. A 멤버변수 m,n을 출력한다.
		System.out.printf("A.m = %d\n",a.getM());
		System.out.printf("A.n = %d\n",a.getN());

		//3. A객체의 멤버함수 work1();
		a.work1();
	}
}
