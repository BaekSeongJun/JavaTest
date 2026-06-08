package chapter10.page29;

public class House extends Bomb{
	//멤변
	int m = 4;
	public static int sm = 4;

	@Override
	public void bomb(){
		System.out.println("자식 House : 집이 무너집니다.");
	}

	public static void sbomb(){
		System.out.println("자식 House : 정적 멤버 함수 입니다.");
	}
}
