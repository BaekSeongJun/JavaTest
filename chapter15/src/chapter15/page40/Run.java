package chapter15.page40;

public class Run {
	public static void main(String[] args) {
		//공유객체
		MyData myData = new MyData();
		//3개의 thread를 만든다. (3번방식)
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				myData.abc("thread1");
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				myData.def("thread2");
			}
		});
		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				myData.ghi("thread3");
			}
		});
		t1.start();
		t2.start();
		t3.start();
	}
}
