package chapter15.page48;

public class MyThread extends Thread {
	public boolean exitFlag = false;
	public boolean yieldFlag = false;
	@Override
	public void run() {
		//무한 루프를 돌면서 조건에 따라, yield상태와 runnable상태일 때  testing
		while(!exitFlag){
			//조건에 따라 yeild상태 실행 상태를 진행한다.
			if(yieldFlag){
				Thread.yield();
			}else{
				System.out.printf(" %s가 실행중임 \n",getName());
				for(long i = 0L; i < 15_000_000_000L; i++){

				}
			}
		}
	}
}
