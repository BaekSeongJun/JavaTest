package chapter15.page59;

//공유객체
public class DataBox {
	//멤버변수 (인변, 정변, 상수, 인클, 정클, 인터페이스)
	private String breadState;

	//생성자(디생,매생,this,super)
	public DataBox(String breadState) {
		this.breadState = null;
	}

	//멤버함수( getter, setter, function, Override(hashcode, equals, toSTring) )
	public synchronized void getBread() {
		if(breadState == null){
			try{
				wait();
			}catch(InterruptedException e){}
		}
		System.out.printf("%s빵을 바구니에서 가져갑니다.\n", breadState);
		breadState = null;
		notify();
	}
	public synchronized void setBread(String breadState) {
		//breadState 방이 존재하면 빵을 바구니에 놓으면 안됩니다.
		if(this.breadState != null){
			try {
				wait();
			} catch (InterruptedException e){}
		}
		this.breadState = breadState;
		System.out.printf("%s빵이 바구니에 있습니다.\n", this.breadState);
		//다른스레드보고 빵이 있으니 가져가라. 다른 thread의 wait()를 깨워줘야한다.
		notify();
	}



}
