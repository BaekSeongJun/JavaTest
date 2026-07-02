public class Run {

	public static void main(String[] args){
		//싱글톤을 이용해서 객체를 만들어서 활용
		SingleTon singleTon1 = SingleTon.getInstance();
		SingleTon singleTon2 = SingleTon.getInstance();
		SingleTon singleTon3 = SingleTon.getInstance();

		singleTon1.print();
		singleTon2.print();
		singleTon3.print();
	}
}
