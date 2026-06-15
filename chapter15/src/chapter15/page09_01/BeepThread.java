package chapter15.page09_01;

import java.awt.*;

public class BeepThread implements Runnable {
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
}
