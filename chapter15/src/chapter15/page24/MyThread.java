package chapter15.page24;

public class MyThread extends Thread {
	@Override
	public void run() {
		//5초만 일을 진행하는 스레드다.
		//적당히 자기 컴퓨터 성능에 맞게 숫자 범위를 조절할것
		for (long i = 0L; i < 1_000_000_000_000_000_000L; i++){

		}
		System.out.printf(" %s가 우선순위: %d 일을 마침 \n", this.getName(), this.getPriority());
	}
}
