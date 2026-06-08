package com.hymedia.exam01;

import java.util.Scanner;

public class ExamForm {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		boolean exitFlag = false;
		while (!exitFlag) {
			System.out.println("============================================================================");
			System.out.println("1. 2. 3. 4. 5.exit");
			System.out.print("번호 입력 : ");
			int choice = Integer.parseInt(scan.nextLine());
			System.out.println("============================================================================");
			switch (choice) {
				case 1:
					practice01();
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					exitFlag = true;
					System.out.println("exit을 입력하셨습니다. 프로그램을 종료합니다");
					break;
				default:
					System.out.println("잘못된 입력입니다. 다시 입력해주세요!!!");
					break;
			}
		}
		if (scan != null) {
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
	}
}

