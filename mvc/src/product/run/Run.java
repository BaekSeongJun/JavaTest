package product.run;

import java.util.Scanner;

import product.view.BookMenu;

public class Run {
	public static Scanner sc = new Scanner(System.in);
	private static BookMenu bm;
	public static void main(String[] args) {
		boolean flag = false;
		while(!flag){
			System.out.println("==========HOME==========");
			System.out.println("1.도서 2.exit");
			System.out.print("메뉴를 선택해주세요 : ");
			int no = Integer.parseInt(sc.nextLine());
			switch(no){
				case 1:
					printBook();
					break;
				case 2:
					flag = true;
					System.out.println("프로그램을 종료합니다.");
					break;
				default:
					System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
					break;
			}
		}
		if(sc != null){
			sc.close();
		}
	}
	private static void printBook() {
		bm= new BookMenu();
		bm.bookDisplay();
	}
}
