package chapter15.page07_2;


public class Run {

	//main 스레드
	public static void main(String[] args) throws InterruptedException {
		// 두가지 일을 동시에 진행하려한다.
		// 사운드 기능을 작동(1초마다 사운드를 발생한다. 5번 발생시킨다.)
		// 숫자를 출력한다. (1초마다 숫자를 1부터 5까지 출력한다.)
		// 사운드 클래스.

		PrintNumberThread2 pn2 = new PrintNumberThread2();
		Thread thread = new Thread(pn2);

		ToolKitThread2 tk2 = new ToolKitThread2();
		Thread thread2 = new Thread(tk2);

		thread.start();
		thread2.start();

		System.out.println("The end");
	}
}
