package chapter15.page07_2;

import java.awt.*;

public class ToolKitThread2 implements Runnable {
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
