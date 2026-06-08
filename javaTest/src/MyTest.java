//디폴트 패키지

import java.util.Scanner;

//클래스시작
public class MyTest {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		for (int a = 0; a < 3; a++) {
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5 - i; j++) {
					System.out.print(" ");
				}
				for (int k = 0; k <= i * 2; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		for (int b = 0; b < 2; b++) {
			for (int c = 0; c < 4; c++) {
				System.out.print(" ");
			}
			for (int d = 0; d < 3; d++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
