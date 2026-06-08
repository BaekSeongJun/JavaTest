package chapter06.page0;

public class Test4 {
	public static void main(String[] args) {

		Rectangle[] rectangles = new Rectangle[3];

		//반복문을 이용해서 각각의 객체를 선언하고, 초기값 설정한다.
		for(int i = 0; i < rectangles.length; i++) {
			rectangles[i] = new Rectangle(10 + i * 3, 10 - 2 * i);
		}
		//반복문을 이용해서 각각의 객체 면적을 구해서 저장한다.
		for(Rectangle rectangle : rectangles) {
			rectangle.areaCalculate();
		}

		//반복문을 이용해서 객체 면적을 출력한다.
		for(Rectangle rectangle : rectangles) {
			rectangle.printInfo();
		}
	}
}
