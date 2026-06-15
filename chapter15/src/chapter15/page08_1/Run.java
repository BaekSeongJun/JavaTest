package chapter15.page08_1;

import java.awt.*;

public class Run {
	public static void main(String[] args){
		//1단계
		// BeepThread th1 = new BeepThread();
		// DisplayThread th2 = new DisplayThread();

		//3단계(1단계 임시객체,익명객체)
		Thread th1 = new Thread(new Runnable() {

			@Override
			public void run() {
				Toolkit tk = Toolkit.getDefaultToolkit();
				for(int i = 0; i < 5; i++){
					tk.beep();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
			}
		});

		Thread th2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i < 5; i++){
					System.out.println("띵");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
			}
		});

		th1.start();
		th2.start();
	}
}
