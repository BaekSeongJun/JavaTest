package chapter15.page51;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		//내가 만든 2개의 thread를 작동시킨다.
		//2개 thread의 state값을 확인한다.

		MyThread1 mt1 = new MyThread1();
		mt1.start();
		MyThread2 mt2 = new MyThread2(mt1);
		mt2.start();

		Thread.sleep(100);
		System.out.printf("MyThread1 State : %s\n",mt1.getState());
		System.out.printf("MyThread2 State : %s\n",mt2.getState());

		mt2.interrupt();
		Thread.sleep(100);
		System.out.printf("MyThread1 State : %s\n",mt1.getState());
		System.out.printf("MyThread2 State : %s\n",mt2.getState());

	}
}
