package chapter11.page09;

//추상클래스 == 일반클래스(추상메서드, new 할 수 없음) : 반드시 멤버함수중에 한개 이상 추상메서드가 있어야한다.
//일반 클래스 : 9가지
 abstract public class Animal extends Object {
	//멤변
	private int price;
	private String name;

	public Animal(){
		this(0,null);
	}
	public Animal(int price, String name){
		this.price = price;
		this.name = name;
	}

	//멤버함수(겟터,셋터,기능,출력, equals, hashcode, 추상메소드)
	 abstract public void cry();

}
