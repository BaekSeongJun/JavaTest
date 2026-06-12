package chapter15.page48;

public class Run {
	public static void main(String[] args) {
		//사용자가 정의한 thread를 2개를 만든다.
		// 모두 데몬 스레드다.
		//사용자가 thread이름을 부여한다.
		//사용자가 한쪽 thread에는 yeild를 진행하고, 다른쪽은 thread는 실행한다.

		MyThread t1 = new MyThread();
		t1.setName("thread1");
		t1.setDaemon(true);
		t1.yieldFlag = false;
		t1.start();

		MyThread t2 = new MyThread();
		t2.setName("thread2");
		t2.setDaemon(true);
		t2.yieldFlag=true;
		t2.start();

		//메인thread 에서 2개의 thread를 1초씩 진행하고 양보하고 조절진행
		for(int i = 0; i< 6; i++){
			try{Thread.sleep(1000);}
			catch(InterruptedException e){}
			t1.yieldFlag = !t1.yieldFlag;
			t2.yieldFlag = !t2.yieldFlag;
		}

		System.out.println("mainThread가 종료됨");
	}
}
