package chapter06.page0;

public class Rectangle {
	//멤버변수
	int width;
	int height;
	int area;

	//디폴트생성자
	public Rectangle(){
		new Rectangle(0,0);
	}

	//매개변수생성자
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	//멤버함수(면적구하는기능)
	public void areaCalculate(){
		area = width * height;
	}

	//멤버함수(출력하는 기능)
	public void printInfo(){
		System.out.printf("width = %-5d height = %-5d  area = %-10d\n", width, height, area);
	}
}
