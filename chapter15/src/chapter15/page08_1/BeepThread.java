package chapter15.page08_1;

import java.awt.*;

public class BeepThread extends Thread{
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
