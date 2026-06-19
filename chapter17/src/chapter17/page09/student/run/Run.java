package chapter17.page09.student.run;

import java.util.Scanner;

import chapter17.page09.student.view.StudentMenu;

public class Run {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		boolean flag = false;
		while(!flag) {
			System.out.println("==========HOME==========");
			System.out.println("1. 학생 2. exit");
			System.out.print("메뉴 선택 : ");
			int num = Integer.parseInt(scan.nextLine());
			switch (num) {
				case 1:
					StudentMenu sm = new StudentMenu();
					sm.studentInfoDisplay();
					break;
				case 2:
					flag = true;
					System.out.println("프로그램을 종료합니다.");
					break;
				default:
					System.out.println("잘못된 입력입니다. 다시 입력해주세요");
					break;
			}
		}
		if(scan != null){
			scan.close();
		}
	}
}
