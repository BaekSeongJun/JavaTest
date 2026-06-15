package chapter16.page27;

public class Run {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.method1("bsj");

		Child c = new Child();
		c.<Number>method1(10);
	}
}
