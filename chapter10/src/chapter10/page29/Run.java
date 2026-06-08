package chapter10.page29;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		//Bomb 객체를 생성해서 bomb() 실행
		Bomb b = new Bomb();
		b.bomb();

		//동시에 4명의 자식객체에 있는 bomb() 작동시키는 방법
		//상속 => 오버라이딩 => 부모객체배열속 자식객체등록
		Bomb[] bombs = new Bomb[] {new Car(), new Tree(), new Building(), new House()};
		for(Bomb bomb : bombs){
			bomb.bomb();
		}
		//멤버변수를 부모객체 = 자식 객체 부모객체.m
		Bomb b2 = new House();
		System.out.printf("b2.m = %d\n",b2.m);
		b2.bomb();
		if(b2 instanceof House){
			System.out.printf("b2.m = %d\n",((House)b2).m);
		}

		//정적멤버변수를 상송했을때 접근방법
		Bomb b3 = new Bomb();
		System.out.println(b3.sm);
		System.out.println(Bomb.sm);

		House h1 = new House();
		System.out.println("====================");
		System.out.println(h1.sm);
		System.out.println(House.sm);

		Bomb b4 = new House();
		System.out.println("====================");
		System.out.println(b4.sm);

		System.out.println("====================");
		Bomb b5 = new Bomb();
		b5.sbomb();
		Bomb.sbomb();

		System.out.println("====================");
		House h2 = new House();
		h2.sbomb();
		House.sbomb();

		System.out.println("====================");
		b4.sbomb();

	}
}
