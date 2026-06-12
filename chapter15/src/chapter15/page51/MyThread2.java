package chapter15.page51;

//멤버변수 MyThread1을 가지고 있다. (MyThread2는 MyThread1협업적인 진행함을 타나남)
public class MyThread2 extends Thread{

	public MyThread1 mt1;

	public MyThread2(MyThread1 mt1){
		this.mt1=mt1;
	}

	@Override
    public void run() {
		try{
			//mt1요청하면 MyThread2야 내가 3초동안 일을 하겠다. 대신 일시정지로 대기하라.
			mt1.join(3000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		//mt1의 자료를 받고 MyThread2 자신의 일을 한다.
		for(long i = 0L; i< 10_000_000_000L; i++);
	}
}
