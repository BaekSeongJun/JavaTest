package chapter15.page50;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		MyThread mt = new MyThread();
		Thread thread = new Thread(mt);
		thread.start();

		//메인스레드 0.1초동안 일시정지, 내가만든 스레드를 점검해본다.
		Thread.sleep(100);
		System.out.printf("MyThread State : %s\n",thread.getState());

		//내가 만든 thread를 메인thread에서 interrupt를 걸어준다.
		thread.interrupt();
		Thread.sleep(100);
		// 내가 만든 상태를 점검한다.
		System.out.printf("MyThread State : %s\n",thread.getState());

	}
}
