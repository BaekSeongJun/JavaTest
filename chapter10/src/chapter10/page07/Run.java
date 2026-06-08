package chapter10.page07;

public class Run {
	public static void main(String[] args) {
		Worker worker = new Worker("bsj",28,1409);
		System.out.printf("이름 : %s, 나이 :  %d, id : %d\n",worker.getName(),worker.getAge(),worker.getWorkerID());
		worker.goToWork();
		worker.eat();
		worker.sleep();
	}
}
