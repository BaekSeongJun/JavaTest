package chapter15.page24;

public class Run {
	public static void main(String[] args) {
		//MyThread 스레드를 10개 스레드로 만들고 일을 시키겠다.
		Thread[] myThreads = new Thread[10];
		for (int i = 0; i < myThreads.length; i++){
			myThreads[i] = new MyThread();
			myThreads[i].setName("MyThread-" + i);
			if(i == 9){
				myThreads[i].setPriority(Thread.MAX_PRIORITY);
			}else{
				myThreads[i].setPriority(Thread.NORM_PRIORITY);
			}

			myThreads[i].start();
		}
		System.out.println("main thread stop");
	}
}
