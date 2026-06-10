package chapter14.page01;

import java.io.InputStreamReader;

public class Run2 {
	public static void main(String[] args) {
		try {
			Thread.sleep(100);
		}catch(Exception e){
			e.printStackTrace();
		}


		try{
			Class cls = Class.forName("java.lang.Ojbect");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		InputStreamReader isr = new InputStreamReader(System.in);
		try{
			isr.read();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
