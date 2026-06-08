package com.hymedia.exam01;

import java.util.Scanner;

public class Exam01 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		//무한반복문
		while (true) {
			//1) 1번 ~ 6번 문제 주제와 선택번호를 보여준다.
			System.out.println("============================================================================");
			System.out.println("1: 정보소개, 2: 사칙연산, 3:면적과 둘레, 4:문자열에서 문자출력 , 5:문자의 유니코드 전환, 6:총점과 평균, 7:exit ");
			System.out.print("번호 입력 : ");
			//2) 번호 선택
			int no = Integer.parseInt(sc.nextLine());
			System.out.println("============================================================================");

			//3) switch case문
			switch (no) {
				case 1:
					practice1();
					break;
				case 2:
					practice2();
					break;
				case 3:
					practice3();
					break;
				case 4:
					practice4();
					break;
				case 5:
					practice5();
					break;
				case 6:
					practice6();
					break;
				case 7:
					System.out.println("exit를 입력하셨습니다. 프로그램을 종료합니다.");
					break;
				default:
					break;
			}
			//no가 1번이나 2번이나 3번이 아니면 종료
			if (no >= 1 && no <= 6) {
				continue;
			} else if (no == 7) {
				break;
			} else {
				System.out.println("잘못된 입력입니다. 다시입력해주세요!!!!!");
			}
		}
		if (sc != null) {
			sc.close();
		}
		System.out.println("the end");
	}

	//1번문제
	private static void practice1() {
		System.out.print("이름을 입력 하세요 : ");
		String name = sc.nextLine();
		System.out.print("성별을 입력 하세요 (남/여): ");
		String gender = sc.nextLine();
		System.out.print("나이를 입력 하세요 : ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.print("키를 입력하세요 (cm) :");
		double height = Double.parseDouble(sc.nextLine());
		System.out.printf("키 %.1fcm인 %d살 %s자 %s님 반갑습니다^^\n", height, age, gender, name);
	}

	//2번문제
	private static void practice2() {
		System.out.print("첫 번째 정수 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("두 번째 정수 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.printf("더하기 결과 : %d\n", num1 + num2);
		System.out.printf("빼기 결과 : %d\n", num1 - num2);
		System.out.printf("곱하기 결과 : %d\n", num1 * num2);
		System.out.printf("나누기 몫 결과 : %d\n", num1 / num2);
		System.out.printf("나누기 나머지 결과 : %d\n", num1 % num2);
	}

	//3번문제
	private static void practice3() {
		System.out.print("가로 : ");
		double width = Double.parseDouble(sc.nextLine());
		System.out.print("세로 : ");
		double height = Double.parseDouble(sc.nextLine());
		double area = width * height;
		double preimeter = (width + height) * 2;
		System.out.printf("면적 : %.2f\n", area);
		System.out.printf("둘레 : %.1f\n", preimeter);
	}

	private static void practice4() {
		System.out.print("문자열을 입력하세요 : ");
		String message = sc.nextLine();
		sc.close();

		System.out.printf("첫 번째 문자 : %c\n", message.charAt(0));
		System.out.printf("두 번째 문자 : %c\n", message.charAt(1));
		System.out.printf("세 번째 문자 : %c\n", message.charAt(2));
	}

	private static void practice5() {
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		sc.close();
		System.out.printf("%c unicode : %d", ch, (int)ch);
	}

	private static void practice6() {
		System.out.print("국어 : ");
		double kor = Double.parseDouble(sc.nextLine());
		System.out.print("영어 : ");
		double eng = Double.parseDouble(sc.nextLine());
		System.out.print("수학 : ");
		double math = Double.parseDouble(sc.nextLine());

		int total = (int)kor + (int)eng + (int)math;
		int avg = total / 3;

		System.out.printf("총점 : %d\n", total);
		System.out.printf("평균 : %d\n", avg);
	}

}
