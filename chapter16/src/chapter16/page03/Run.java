package chapter16.page03;

public class Run {
	public static void main(String[] args) {
		// Goods1, Goods2
		Goods1 goods1 = new Goods1(new Apple());
		Apple apple = goods1.getApple();
		goods1.setApple(apple);

		// Goods1 goods11 = new Goods1(new Pencil());

		Goods2 goods2 = new Goods2(new Pencil());
		Pencil pencil = goods2.getPencil();
		goods2.setPencil(pencil);

		// Goods2 goods22 = new Goods2(new Apple());

		//=======================================================

		//Object 타입으로 한 클래스만 생성하면 되었다.
		//다운캐스팅, ClassCastingException 발생.
		//Good => Apple, Pencil 넣어서 사용해보자

		Goods good1 = new Goods(new Apple());
		//문제점 반드시 다운캐스팅이 이루어져야한다.
		Apple apple1 = (Apple)good1.getObj();
		good1.setObj(apple1);

		Goods good2 = new Goods(new Pencil());
		//문제점 반드시 다운캐스팅이 이루어져야한다.
		Pencil pencil1 = (Pencil)good2.getObj();
		good2.setObj(pencil1);

		//=======================================================
		MyClass<Apple> mc = new MyClass<>(new Apple());
		Apple apple3 = mc.getT();
		mc.setT(apple3);

		MyClass<Pencil> mc2 = new MyClass<>(new Pencil());
		Pencil pencil3 = mc2.getT();
		mc2.setT(pencil3);
	}
}
