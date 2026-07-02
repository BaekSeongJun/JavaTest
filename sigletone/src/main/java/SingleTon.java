//싱글톤(3가지 -> 멤버 변수(정적,private), 생성자(private), 멤버 함수(정적)
public class SingleTon {
	private static SingleTon instance;
	private SingleTon(){
		System.out.println("생성자");
	}
	public static SingleTon getInstance(){
		if(instance == null) {
			instance = new SingleTon();
		}
		return instance;
	}

	public void print(){
		System.out.println("싱글톤 객체에서 사용하는 함수입니다.");
	}
}
