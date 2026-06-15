package chapter15.page08_2;

import java.awt.*;

public class Run {
	public static void main(String[] args) {
		//2단계
		// Runnable th1 = new BeepThread();
		// Runnable th2 = new DisplayThread();

		//4단계
		// Runnable th1 = new Runnable() {
		// 	@Override
		// 	public void run() {
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
		// Runnable th2 = new Runnable() {
		// 	@Override
		// 	public void run() {
		// 		for(int i = 0; i < 5; i++){
		// 			System.out.println("띵");
		// 			try {
		// 				Thread.sleep(1000);
		// 			} catch (InterruptedException e) {
		// 			}
		// 		}
		// 	}
		// };

		//5번 방식
		Thread th11 = new Thread( () -> {
			Toolkit tk = Toolkit.getDefaultToolkit();
			for(int i = 0; i < 5; i++){
				tk.beep();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		});
		
		Thread th22 = new Thread( () -> {
			for(int i = 0; i < 5; i++){
				System.out.println("띵");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		});

		th11.start();
		th22.start();
	}
}
