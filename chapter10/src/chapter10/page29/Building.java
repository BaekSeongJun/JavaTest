package chapter10.page29;

public class Building extends Bomb{
	@Override
	public void bomb(){
		System.out.println("자식 Building : 건물이 무너지고 있습니다.");
	}
}
