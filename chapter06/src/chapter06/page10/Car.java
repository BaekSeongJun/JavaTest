package chapter06.page10;

public class Car {
	//멤버변수(색상, 가격, 생산년도, 차명)
	private String color;
	private int price;
	private int productYear;
	private String name;

	//생성자(디폴트, 일반)
	public Car() {
		new Car("",0,0,"");
	}
	public Car(String color, int price, int productYear, String name) {
		this.color = color;
		this.price = price;
		this.productYear = productYear;
		this.name = name;
	}

	//setter함수
	public void setColor(String color) {
		if(color == null || color.isEmpty()){
			System.out.println("장난치지마");
			return;
		}
		this.color = color;
	}

	//getter함수
	public String getColor() {
		return color;
	}

	//멤버함수 (운전, 출력)
	public void drive(){
		//색상 차이름 넣고 운전한다. 메세지를 출력한다.
		System.out.printf("%s색상인 %s를 타고 운전한다.\n", color, name);
	}

	public void printCarInfo(){
		System.out.printf("색상 : %5s 가격 : %-7d 생상년도 : %-7d 차이름 : %s \n",color, price, productYear, name);
	}

	//toString

	@Override
	public String toString() {
		return "Car{" +
			"color='" + color + '\'' +
			", price=" + price +
			", productYear=" + productYear +
			", name='" + name + '\'' +
			'}';
	}
}
