package chapter04.page08;

import java.util.Scanner;

public class SwtichTest {
	public static void main(String[] args) {
		// switch case문에 break가 있는것과 없는것의 차이점
		// no = 1 -> 'A', 2= -> 'B', 3-> 'C', 4->'D', default -> "해당사항없음"
		Scanner sc = new Scanner(System.in);
		System.out.print("input no(1~5)>> ");
		int no = Integer.parseInt(sc.nextLine());
		switch (no) {
			case 1:
				System.out.println("A");
				// break;
			case 2:
				System.out.println("B");
				// break;
			case 3:
				System.out.println("C");
				// break;
			case 4:
				System.out.println("D");
				// break;
			default:
				System.out.println("해당사항없음");
				// break;
		}
		sc.close();
		System.out.println("the end");
	}
}
