package chapter15.page32;

//공유객체
public class MyData {
	//멤변(6가지)
	private int data;

	public MyData(){
		this(0);
	}
	public MyData(int data){
		super();
		this.data = data;
	}

	//멤버함수
	public void setData(int data){
		this.data = data;
	}
	public int getData(){
		return this.data;
	}

	//멤버함수(기능) 자기멤버변수 +1 함수
	public void plusData(){
		synchronized (this){
		int bufferData = this.data;
		try{
			//2초동안 멈추게 되므로,100% context switching 발생(thread1, thread2 교차)
			Thread.sleep(100);
		}catch(InterruptedException e){}
		this.data = bufferData +1;
		}
	}
}
