package chapter15.page07;

import java.awt.*;

public class ToolKitThread extends Thread {
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
		System.out.println("ToolKitThread The end");
	}
}
