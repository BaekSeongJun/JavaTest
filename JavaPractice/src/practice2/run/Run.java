package practice2.run;

import java.util.Scanner;

import practice2.view.BookMenu;

public class Run {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		boolean exitFlag = false;
		while(!exitFlag) {
			System.out.println("1.도서, 2.판매, 3.회원관리, 4.관리자, 5.게시판 ,6.종료");
			System.out.print("1~6번선택 >>");
			int no = 0;
			try{
				no = Integer.parseInt(sc.nextLine());
			}catch(Exception e){
				System.out.println("예상치 못한 오류가 발생했습니다. 다시 시도해주세요");
			}

			switch (no) {
				case 1: {
					BookMenu bm = new BookMenu();
					bm.bookInfoDisplay();
					break;
				}
				case 2:{
					System.out.println("도서판매는 작업중");
					break;
				}
				case 6:{
					System.out.println("프로그램을 종료합니다.");
					exitFlag = true;
					break;
				}
				default:
					System.out.println("고객님 메뉴에 있는 번호선택해주세요.");
					break;
			}
		}
		try {
			if (sc != null) {
				sc.close();
			}
		}catch (Exception e) {
		}

	}
}
