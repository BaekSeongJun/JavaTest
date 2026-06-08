package chapter04.page09;

import java.util.Scanner;

public class SwitchPractice {
	// static 전역변수다/
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// 4 무한반복문을 설정한다.
		while (true) {
			// 1.문제를 출력한다.
			System.out.println
				("1번 :양수출력, 2번:양/음이프 , 3번:짝홀수 ,4번:사탕문제 ,5번:학생정보,6번:나이,7번:점수평균 ,8번:주민번호,9번:트루폴스,10번:연봉,11번:exit");
			System.out.print(">>");
			// 2.문제번호입력저장한다.
			int no = Integer.parseInt(scan.nextLine());
			// 3.문제번호에 따라서 실행하는 함수를 선택한다.(switch case)
			switch (no) {
				case 1:
					page9Practice();
				case 2:
					break;

				case 3:
					break;

				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				case 7:
					break;
				case 8:
					break;
				case 9:
					break;
				case 10:
					break;
				case 11:
					break;
				default:
					System.out.println("정신차려~ 너 때문에 프로그램 종료되었다.");
					break;
			}
			// 5.무한방복문 종료조건을 준다.1~3
			if (no < 1 || no >11) {
				break;
			}
		}
		// 6)자원반납
		if (scan != null) {
			scan.close();
		}
		System.out.println("The end");
	}

	private static void page9Practice() {
		System.out.print("정수 입력 : ");
		int no = Integer.parseInt(scan.nextLine());
		switch(no){
			case 10:
			case 9:
			case 8:
			case 7:
				System.out.println("Pass");
				break;
			default:
				System.out.println("Fail");
		}
	}

}

