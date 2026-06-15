package chapter15.page59;

public class Run {
	public static void main(String[] args) {
		//공유객체
		DataBox db = new DataBox(null);

		// 2개의 스레드 객체를 만든다. (3번방식으로 진행)
		// 첫번째 스레드 빵을 한개씩 만들어서 DataBox에 집어넣는다. (10번진행)
		// 두번째 스레드 빵이 있으면 DataBox에서 가져온다. (10번진행)

		//빵을 만들어서 입력하는 Thread
		Thread th1 = new Thread() {
			@Override
			public void run() {
				for(int i = 0; i < 10; i++){
					db.setBread(i + "번째");
				}
			}
		};
		//빵을 가져가는 Thread
		Thread th2 = new Thread() {
			@Override
			public void run() {
				for(int i = 0; i < 10; i++){
					db.getBread();
				}
			}
		};

		th1.start();
		th2.start();

	}
}
