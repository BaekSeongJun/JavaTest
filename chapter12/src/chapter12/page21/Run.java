package chapter12.page21;

public class Run {
	public static void main(String[] args) {
		//객체를 생성한다.(Animal)
		Animal animal = new Dog();
		animal.cry();
		System.out.println(((Dog)animal).m);
	}
}
