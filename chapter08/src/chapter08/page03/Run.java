package chapter08.page03;

import bcd.def.Connect;

public class Run {
	public static void main(String[] args) {
		//def에 있는 클래스 Connect를 객체화해서 사용하고 싶다.
		Connect connect = new Connect();
		//abc에 있는 클래스 Connect를 객체화해서 사용하고 싶다.
		abc.bcd.Connect connect1 = new abc.bcd.Connect();

		java.lang.System.out.println("출력기능");
	}
}
