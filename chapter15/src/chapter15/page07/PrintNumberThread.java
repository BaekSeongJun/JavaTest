package chapter15.page07;

public class PrintNumberThread extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 5; i++){
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		System.out.println("PrintNumber The end");
	}
}
