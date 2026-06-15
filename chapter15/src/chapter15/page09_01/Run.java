package chapter15.page09_01;

import java.awt.*;

public class Run {
	public static void main(String[] args) {
		//1번방식
		// BeepThread th1 =  new BeepThread();
		// DisplayThread th2 = new DisplayThread();

		//3번 방식
		// Thread th1 = new Thread(){
		// 	@Override
		// 	public void run(){
		// 		Toolkit tk = Toolkit.getDefaultToolkit();
		// 		for(int i = 0; i < 5; i++){
		// 			tk.beep();
		// 			try {
		// 				Thread.sleep(1000);
		// 			} catch (InterruptedException e) {
		// 			}
		// 		}
		// 	}
		// };
		//
		// Thread th2 = new Thread(){
		// 	@Override
		// 	public void run(){
		// 		for(int i = 0; i < 5; i++){
		// 			System.out.println("삡");
		// 			try {
		// 				Thread.sleep(1000);
		// 			} catch (InterruptedException e) {
		// 			}
		// 		}
		// 	}
		// };

		// //2번방식
		// Runnable th1 = new BeepThread();
		// Runnable th2 = new DisplayThread();

		// 4번 방식 -> 5번 방식
		Thread t1 = new Thread(() -> {
			Toolkit tk = Toolkit.getDefaultToolkit();
			for(int i = 0; i < 5; i++){
				tk.beep();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		});
		Thread t2 = new Thread(() -> {
			for(int i = 0; i < 5; i++){
				System.out.println("삡");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		});

		t1.start();
		t2.start();
	}
}
