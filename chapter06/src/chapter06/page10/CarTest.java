package chapter06.page10;

public class CarTest {
	static String[] colors = {"yellow", "red", "black"};
	static String[] carNames = {"sorento", "genesis", "grandeur"};
	public static void main(String[] args) {
		// 3대의 정보를 입력한다.
		Car[] cars = new Car[3];

		for(int i = 0; i < cars.length; i++){
			cars[i] = new Car(colors[i],10000 * (i+10), 2025+i,carNames[i]);
		}

		//등록된 객체에 멤버변수값을 수정
		// cars[0].color = "blue";
		cars[0].setColor("gray");

		//차 3대 운영
		cars[0].drive();
		cars[1].drive();
		cars[2].drive();

		//차 정보출력
		cars[0].printCarInfo();
		cars[1].printCarInfo();
		cars[2].printCarInfo();

		//첫번째 차의 색상을 출력하고 싶다.
		System.out.printf("첫 번째 차 색상은 %s\n",cars[0].getColor());
		System.out.println(cars[0].toString());
		System.out.println(cars[1]);
		System.out.println(cars[2]);
	}
}
