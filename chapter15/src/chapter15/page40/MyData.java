package chapter15.page40;

public class MyData {
	//멤버함수(반복문을 이용해서 1초,2초,3초출력 0.5sleep()
	public synchronized void abc(String threadName){
		for(int i = 0; i < 3; i++){
			System.out.printf("%s : %d 초\n",threadName, i + 1);
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){}
		}
	}
	//멤버함수(반복문을 이용해서 1번,2번,3번출력 0.5sleep()
	public synchronized void def(String threadName){
		for(int i = 0; i < 3; i++){
			System.out.printf("%s : %d 번\n",threadName, i + 1);
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){}
		}
	}
	//멤버함수(반복문을 이용해서 1sec,2sec,3sec출력 0.5sleep()
	public void ghi(String  threadName){
		synchronized(new Object()) {
			for (int i = 0; i < 3; i++) {
				System.out.printf("%s : %d sec\n", threadName, i + 1);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
			}
		}
	}

}
