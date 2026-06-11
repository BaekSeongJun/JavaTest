package chapter15.page07;

public class Run {

	//main 스레드
	public static void main(String[] args) throws InterruptedException {
		// 두가지 일을 동시에 진행하려한다.
		// 사운드 기능을 작동(1초마다 사운드를 발생한다. 5번 발생시킨다.)
		// 숫자를 출력한다. (1초마다 숫자를 1부터 5까지 출력한다.)
		// 사운드 클래스.
		//부모가 Thread
		Thread tk = new ToolKitThread();
		Thread pn = new PrintNumberThread();

		//main스레드
		tk.start();
		pn.start();

		Thread.sleep(2000);

		System.out.println("The end");
	}
}
