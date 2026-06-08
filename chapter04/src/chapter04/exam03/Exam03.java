package chapter04.exam03;

import java.util.Scanner;

public class Exam03 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		while(true) {
			System.out.println("============================================================================");
			System.out.println("1. 1번문제 2. 2번문제 3. 3번문제 4. 4번문제 5.exit");
			System.out.print("번호 입력 : ");
			int choice = Integer.parseInt(scan.nextLine());
			System.out.println("============================================================================");
			switch(choice) {
				case 1:
					practice01();
					break;
				case 2:
					practice02();
					break;
				case 3:
					practice03();
					break;
				case 4:
					practice04();
					break;
				case 5:
					System.out.println("exit을 입력하셨습니다. 프로그램을 종료합니다");
					break;
				default:
					System.out.println("잘못된 입력입니다. 다시 입력해주세요!!!");
					break;
			}
			if (choice == 5){
				break;
			}
		}
		if(scan != null) {
			scan.close();
		}
		System.out.println("the end");
	}
	public static void practice01() {
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("1번문제입니다.");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println();

		while(true) {
			System.out.print("1. 입력\n2.수정\n3.조회\n4.삭제\n7.종료\n메뉴 번호를 입력하세요 : ");
			int no = Integer.parseInt(scan.nextLine());
			switch (no) {
				case 1:
					System.out.println("입력 메뉴입니다.");
					break;
				case 2:
					System.out.println("수정 메뉴입니다");
					break;
				case 3:
					System.out.println("조회 메뉴입니다");
					break;
				case 4:
					System.out.println("삭제 메뉴입니다");
					break;
				case 7:
					System.out.println("7을 입력하셨습니다. 처음으로 돌아갑니다.");
					break;
				default:
					System.out.println("잘못된 입력입니다.");
					continue;
			}
			break;
		}
	}
	public static void practice02() {
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("2번문제입니다.");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println();

		int no = 0;

		while(true) {
			System.out.print("숫자를 한개 입력하세요 (0이 아닌 양수만 입력): ");
			no = Integer.parseInt(scan.nextLine());
			if(no <= 0){
				System.out.println("0이 아닌 양수만 입력해주세요");
			}else{
				break;
			}
		}

		if(no % 2 == 0){
			System.out.println("짝수다.");
		}else{
			System.out.println("홀수다.");
		}
	}
	public static void practice03() {
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("3번문제입니다.");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println();

		int score = 0;
		while(true) {
			System.out.print("점수를 입력하세요 (0-100) : ");
			score = Integer.parseInt(scan.nextLine());
			if (score < 0 || score > 100) {
				System.out.println("점수를 올바르게 입력해주세요.");
			} else {
				break;
			}
		}
		switch (score/10) {
			case 10:
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			default:
				System.out.println("F");
				break;
		}
		// if(score >= 90){
		// 	System.out.println("A");
		// }else if (score >= 80) {
		// 	System.out.println("B");
		// }else if (score >= 70) {
		// 	System.out.println("C");
		// }else{
		// 	System.out.println("F");
		// }
	}
	public static void practice04() {
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("4번문제입니다.");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println();

		System.out.print("피연산자1 입력 : ");
		int num1 =  Integer.parseInt(scan.nextLine());
		System.out.print("피연산자2 입력 : ");
		int num2 =  Integer.parseInt(scan.nextLine());
		while(true) {
			System.out.print("연산자 입력 (+, -, *, /, %) : ");
			char op = scan.nextLine().charAt(0);
			switch (op) {
				case '+':
					System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
					break;
				case '-':
					System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
					break;
				case '*':
					System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
					break;
				case '/':
					if (num2 == 0) {
						System.out.println("0으로 나눌 수 없습니다!!!!");
						continue;
					}
					System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
					break;
				case '%':
					System.out.printf("%d %% %d = %d\n", num1, num2, num1 % num2);
					break;
				default:
					System.out.println("잘못 입력하셨습니다. 연산자를 다시 입력해주세요");
					continue;
			}
			break;
		}
	}
}

