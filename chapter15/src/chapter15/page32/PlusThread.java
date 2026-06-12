package chapter15.page32;

public class PlusThread extends Thread {
	//멤버변수(공유데이터 객체)
	private MyData myData;

	//생성자
	public PlusThread(MyData myData) {
		this.myData = myData;
	}

	@Override
	public void run() {
		//자기멤버변수인 myData에 plusData() 실행
		//자기멤버변수인 myData에 있는 data를 출력
		myData.plusData();
		System.out.printf("%s thread에 data결과값은 %d\n",this.getName(),myData.getData());
	}
}
