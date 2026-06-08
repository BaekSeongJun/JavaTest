package chapter10.page07;

public class Worker extends Human{
	private int workerID;

	public Worker(){
		this(null,0,0);
	}

	public Worker(String name, int age, int workerID){
		super(name,age);
		this.workerID = workerID;
	}

	public int getWorkerID() {
		return workerID;
	}

	public void goToWork(){
		System.out.println("자식 클래스 출근하기");
	}
}
