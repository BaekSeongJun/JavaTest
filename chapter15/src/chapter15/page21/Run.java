package chapter15.page21;

public class Run {

	//main 스레드
	public static void main(String[] args) throws InterruptedException {
		// 두가지 일을 동시에 진행하려한다.
		// 사운드 기능을 작동(1초마다 사운드를 발생한다. 5번 발생시킨다.)
		// 숫자를 출력한다. (1초마다 숫자를 1부터 5까지 출력한다.)
		// 사운드 클래스.

		PrintNumberThread2 pn2 = new PrintNumberThread2();
		Thread thread = new Thread(pn2);
		thread.setName("땡땡스레드");

		ToolKitThread2 tk2 = new ToolKitThread2();
		Thread thread2 = new Thread(tk2);
		thread2.setName("땡땡소리쓰레드");

		thread.start();
		thread2.start();

		//현재 작동되고 있는 스레드 수
		System.out.printf("현재 작동 되고 있는 스레드 수 : %d\n",Thread.activeCount());
		//현재 작동되고 있는 스레드 이름
		System.out.printf("thread.start() 진짜 이름 : %s\n",thread.getName());
		System.out.printf("thread2.start() 진짜 이름 : %s\n",thread2.getName());

		System.out.printf("thread의 우선순위는 : %s\n",thread.getPriority());
		System.out.printf("thread2의 우선순위는 : %s\n",thread2.getPriority());

		System.out.println("The end");
	}
}
