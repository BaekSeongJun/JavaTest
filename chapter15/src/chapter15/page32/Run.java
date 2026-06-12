package chapter15.page32;

public class Run {
	public static void main(String[] args) {
		//공유객체를 만든다.
		MyData myData = new MyData(3);

		//1.스레드1을 만들고 진행
		PlusThread pt1 = new PlusThread(myData);
		pt1.setName("스레드1번");
		pt1.start();

		//2.스레드2를 만들고 진행
		PlusThread pt2 = new PlusThread(myData);
		pt2.setName("스레드2번");
		pt2.start();
	}
}
