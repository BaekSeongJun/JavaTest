package chapter11.page09;

public class Run {
	public static void main(String[] args) {
		//다형성 구현 부모객체배열로 각각의 자식에 객체 번지를 저장한다.
		//2. 반복문을 사용해서 다형성을 구현한다.
		Animal[] animals = new Animal[] {new Cat(), new Dog()};
		animals[0].cry();
		animals[1].cry();

	}
}
