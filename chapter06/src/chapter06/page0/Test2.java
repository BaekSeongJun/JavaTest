package chapter06.page0;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		// 직사각형 면적을 구하는 프로그램이다.
		// 사용자로부터 폭과 높이를 입력받고 면적을 구해서 출력하는 프로그램을 구현한다.
		Scanner sc = new Scanner(System.in);

		int width = 0;
		int height = 0;
		int area = 0;

		System.out.print("width : ");
		width = Integer.parseInt(sc.nextLine());
		System.out.print("height : ");
		height = Integer.parseInt(sc.nextLine());

		area = width * height;

		System.out.printf("width = %-5d height = %-5d  area = %-10d\n", width, height, area);

		if(sc != null){
			sc.close();
		}
	}
}
