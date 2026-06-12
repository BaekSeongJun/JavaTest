package chapter15.page50;

public class MyThread implements Runnable{
	@Override
	public void run() {
		//일시정지상태로 빠진다.(4초동안)
		//일시정지상태에서 interrupt 발생 시 interrupt 메세지와 시간지연(for) 구현한다.
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			System.out.println(e.toString());
			for(long i = 0; i < 20_000_000_000L; i++){}
		}
	}
}
