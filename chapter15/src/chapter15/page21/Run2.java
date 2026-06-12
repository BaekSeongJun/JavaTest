package chapter15.page21;

public class Run2 {
	public static void main(String[] args) {
		//현재의 스레드 객체를 가져옵니다.
		Thread mainThread = Thread.currentThread();
		//메인 스레드의 이름을 확인해보자
		System.out.printf("메인 스레드 이름 : %s\n",mainThread.getName());
		mainThread.setName("bsjThread");
		System.out.printf("메인 스레드 이름 : %s\n",mainThread.getName());
		System.out.printf("메인 스레드의 우선순위는 : %s\n",mainThread.getPriority());
		System.out.printf("현재 시스템의 코어 수(CPU갯수) : %d\n",Runtime.getRuntime().availableProcessors());
	}
}
