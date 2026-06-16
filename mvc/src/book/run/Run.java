package book.run;

import java.util.Scanner;

import book.view.BookMenu;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		while(!flag) {
			System.out.println("==========HOME==========");
			System.out.println("1. 도서 2. exit");
			System.out.print("메뉴 선택 : ");
			int num = Integer.parseInt(sc.nextLine());
			switch (num) {
				case 1:
					BookMenu bm = new BookMenu();
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
		if(sc != null){
			sc.close();
		}
	}
}
