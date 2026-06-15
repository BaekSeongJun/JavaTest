package chapter15.page09_01;

public class DisplayThread implements Runnable {
	@Override
	public void run() {
		for(int i = 0; i < 5; i++){
			System.out.println("삡");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}

}
