package chapter06.page0;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		//배열과 반복문을 이용할것
		// 직사각형을 면적을 구하는 프로그램이다.
		// 사용자로부터 폭과 높이를 입력받고 면적을 구해서 출력하는 프로그램을 구현한다.

		Scanner sc = new Scanner(System.in);

		int[] width = new int[3];
		int[] height = new int[3];
		int[] area = new int[3];

		for(int i = 0; i < width.length; i++){
			System.out.printf("width%d : ",i);
			width[i] = Integer.parseInt(sc.nextLine());
			System.out.printf("height%d : ",i);
			height[i] = Integer.parseInt(sc.nextLine());

			area[i] = width[i] * height[i];
		}
		for(int i = 0; i < width.length; i++){
			System.out.printf("width%d = %-5d height%d = %-5d  area%d = %-10d\n", i, width[i], i, height[i], i, area[i]);
		}
		if(sc != null){
			sc.close();
		}
	}
}
