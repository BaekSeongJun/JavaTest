package chapter10.page29;

public class Bomb {
	//멤변
	int m = 3;
	public static int sm = 3;
	public void bomb() {
		System.out.println("부모 Bomb: 폭탄이 터집니다.");
	}

	public static void sbomb(){
		System.out.println("부모 Bomb : 정적 멤버 함수 입니다.");
	}
}
