package chapter15.page07_4;

import java.awt.*;

public class Run {
	//main 스레드
	public static void main(String[] args) throws InterruptedException {
		// 두가지 일을 동시에 진행하려한다.
		// 사운드 기능을 작동(1초마다 사운드를 발생한다. 5번 발생시킨다.)
		// 숫자를 출력한다. (1초마다 숫자를 1부터 5까지 출력한다.)
		// 사운드 클래스.
		//람다식 표현
		Thread thread = new Thread(() -> {
				for(int i = 0; i < 5; i++){
					System.out.println("띵");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
		});

		Thread thread2 = new Thread(() -> {
				Toolkit tk = Toolkit.getDefaultToolkit();
				for(int i = 0; i < 5; i++){
					tk.beep();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
		});

		thread.start();
		thread2.start();
		
		System.out.println("The end");
	}
}
