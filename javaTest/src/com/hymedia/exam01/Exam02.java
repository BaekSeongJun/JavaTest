package com.hymedia.exam01;

import java.util.Scanner;

public class Exam02 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		//4)무한반복문
		while (true) {
			//1) 문제를 출력한다.
			System.out.println("============================================================================");
			System.out.println(
				"1: 양수출력, 2:양수 음수 출력, 3: 짝수 홀수 출력, 4:인원수만큼 사탕 분배,\n5:정보입력받고 출력, 6:나이로 분류, 7:합계 평균 합격 불합격 8:주민번호 남여 구분하기,\n9:3개의 수가 같은지 판별, 10: 연봉계산, 11:exit ");
			System.out.print("번호 입력 : ");
			//2) 문제번호입력저장한다.
			int no = Integer.parseInt(sc.nextLine());
			System.out.println("============================================================================");
			//3) 문제번호에 따라서 실행하는 함수를 선택한다.(switch case)
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
					practice7();
					break;
				case 8:
					practice8();
					break;
				case 9:
					practice9();
					break;
				case 10:
					practice10();
					break;
				case 11:
					System.out.println("exit를 입력하셨습니다. 프로그램을 종료합니다.");
					break;
				default:
					break;
			}
			//5)무한반복은 종료조건을 준다. 1~3
			if (no == 11) {
				break;
			} else if (no < 1 || no > 10) {
				System.out.println("잘못된 입력입니다. 다시입력해주세요!!!!!");
			}
		}
		if (sc != null) {
			sc.close();
		}
		System.out.println("the end");
	}

	private static void practice1() {
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("1번문제입니다.");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println();

		System.out.print("정수 : ");
		int num = Integer.parseInt(sc.nextLine());
		if (num < 0) {
			System.out.println("양수가 아니다");
		} else {
			System.out.println("양수다");
		}
	}

	private static void practice2() {
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("2번문제입니다.");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println();

		System.out.print("정수 : ");
		int num = Integer.parseInt(sc.nextLine());
		if (num < 0) {
			System.out.println("음수다");
		} else if (num > 0) {
			System.out.println("양수다.");
		} else {
			System.out.println("0이다.");
		}
	}

	private static void practice3() {
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("3번문제입니다.");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println();

		System.out.print("정수 : ");
		int num = Integer.parseInt(sc.nextLine());
		if (num % 2 == 0) {
			System.out.println("짝수다");
		} else {
			System.out.println("홀수다");
		}
	}

	private static void practice4() {
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("4번문제입니다.");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println();

		System.out.print("인원 수 : ");
		int people = Integer.parseInt(sc.nextLine());
		System.out.print("사탕 개수: ");
		int candy = Integer.parseInt(sc.nextLine());
		int oneForCandy = candy / people;
		int elseCandy = candy % people;
		System.out.printf("1인당 사탕 개수 : %d \n 남는 사탕 개수 : %d \n", oneForCandy, elseCandy);
	}

	private static void practice5() {
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("5번문제입니다.");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println();

		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년(숫자만) : ");
		int grade = Integer.parseInt(sc.nextLine());
		System.out.print("반(숫자만) : ");
		int classroom = Integer.parseInt(sc.nextLine());
		System.out.print("번호(숫자만) : ");
		int number = Integer.parseInt(sc.nextLine());
		System.out.print("성별(M/F) : ");
		String gender = String.valueOf(sc.nextLine().toUpperCase().charAt(0));
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double score = Double.parseDouble(sc.nextLine());
		if (gender.equals("M")) {
			System.out.printf("%d학년 %d반 %d번 %s 남학생의 성적은 %.2f이다.\n", grade, classroom, number, name, score);
		} else {
			System.out.printf("%d학년 %d반 %d번 %s 여학생의 성적은 %.2f이다.\n", grade, classroom, number, name, score);
		}

	}

	private static void practice6() {
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("6번문제입니다.");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println();

		System.out.print("나이 : ");
		int age = Integer.parseInt(sc.nextLine());
		if (age < 0) {
			System.out.println("잘못된 입력입니다. 나이는 음수일 수 없습니다.");
		} else if (age <= 13) {
			System.out.println("어린이");
		} else if (age <= 19) {
			System.out.println("청소년");
		} else {
			System.out.println("성인");
		}
	}

	private static void practice7() {
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("7번문제입니다.");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println();

		System.out.print("국어 : ");
		int kor = Integer.parseInt(sc.nextLine());
		System.out.print("영어 : ");
		int eng = Integer.parseInt(sc.nextLine());
		System.out.print("수학 : ");
		int math = Integer.parseInt(sc.nextLine());

		int sum = kor + eng + math;
		double avg = (double)sum / 3.0;

		System.out.printf("합계 : %d\n평균 : %.1f\n", sum, avg);
		if (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
			System.out.println("합격");

		} else {
			System.out.println("불합격");
		}
	}

	private static void practice8() {
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("8번문제입니다.");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println();

		System.out.print("주민번호를 입력하세요 (- 포함 ) : ");
		int genderNumber = Integer.parseInt(String.valueOf(sc.nextLine().charAt(7)));
		if (genderNumber == 1 || genderNumber == 3) {
			System.out.println("남자");
		} else if (genderNumber == 2 || genderNumber == 4) {
			System.out.println("여자");
		} else {
			System.out.println("잘못된 입력입니다!");
		}
	}

	private static void practice9() {
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("9번문제입니다.");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println();

		System.out.print("입력1 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("입력2 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.print("입력3 : ");
		int num3 = Integer.parseInt(sc.nextLine());
		if (num1 == num2 && num2 == num3) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	private static void practice10() {
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("10번문제입니다.");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println();

		System.out.print("A사원의 연봉 : ");
		int employeeA = Integer.parseInt(sc.nextLine());
		System.out.print("B사원의 연봉 : ");
		int employeeB = Integer.parseInt(sc.nextLine());
		System.out.print("C사원의 연봉 : ");
		int employeeC = Integer.parseInt(sc.nextLine());

		double salaryA = (double)employeeA + (employeeA * 0.4);
		double salaryB = (double)employeeB + (employeeA * 0.0);
		double salaryC = (double)employeeC + (employeeA * 0.15);

		System.out.printf("A 사원 연봉/연봉+a : %d/%.1f\n", employeeA, salaryA);
		if (salaryA >= 3000) {
			System.out.println("3000이상");
		} else {
			System.out.println("3000미만");
		}
		System.out.printf("B 사원 연봉/연봉+a : %d/%.1f\n", employeeB, salaryB);
		if (salaryB >= 3000) {
			System.out.println("3000이상");
		} else {
			System.out.println("3000미만");
		}
		System.out.printf("C 사원 연봉/연봉+a : %d/%f\n", employeeC, salaryC);
		if (salaryC >= 3000) {
			System.out.println("3000이상");
		} else {
			System.out.println("3000미만");
		}
	}
}
