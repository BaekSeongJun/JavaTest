package book.view;

import java.util.Scanner;

import book.controller.BookController;
import book.model.Book;

public class BookMenu {
	private BookController bcm;

	public BookMenu(){
		bcm = new BookController();
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		while(!flag) {
			System.out.println("==========도서 메뉴입니다.==========");
			System.out.println("1. 도서 정보 2. 대여 통계 3. 도서 등급 판별 4. 도서 정렬 5. 도서 검색 6. Home");
			System.out.print("메뉴 선택 : ");
			int num = Integer.parseInt(sc.nextLine());
			switch (num) {
				case 1:
					printBook();
					break;
				case 2:
					printSumAvg();
					break;
				case 3:
					printIsBest();
					break;
				case 4:
					printSortedBooks();
					break;
				case 5:
					printSearchBook();
					break;
				case 6:
					System.out.println("홈으로 돌아갑니다.");
					flag = true;
					break;
				default:
					System.out.println("잘못된 입력입니다. 다시 입력해주세요");
					break;
			}
		}
	}

	public void printBook(){
		System.out.println("==========도서 정보 출력==========");
		Book[] books = bcm.printBook();
		for(Book book : books){
			System.out.println(book.inform());
		}
	}

	public void printSumAvg(){
		System.out.println("==========대여 통계 출력==========");
		double[] sumAvg = bcm.avgRentCount();
		System.out.printf("전체 도서 대여 횟수 합계 : %d\n전체 도서 대여 횟수 평균 : %.1f\n", (int)sumAvg[0], sumAvg[1]);
	}

	public void printIsBest(){
		System.out.println("==========도서 등급 판별==========");
		Book[] books = bcm.printBook();
		for(Book book : books){
			if (book.getRentCount() > BookController.CUT_LINE){
				System.out.printf("%s는 인기도서(Best Seller)입니다.\n",book.getTitle());
			}else{
				System.out.printf("%s는 일반도서 입니다.\n",book.getTitle());
			}
		}
	}

	public void printSortedBooks(){
		System.out.println("==========도서 정렬 출력==========");
		Book[] books = bcm.sortByRentCountDesc();
		for(int i = 0; i< books.length; i++){
			System.out.printf("%d. %s \n",i+1,books[i].inform());
		}
	}

	public void printSearchBook(){
		Scanner sc = new Scanner(System.in);
		System.out.println("==========도서 검색 출력==========");
		System.out.print("검색 할 도서명 입력 : ");
		Book[] result = bcm.searchBook(sc.nextLine());
		System.out.println("도서 검색 결과 : ");
		if(result.length == 0){
			System.out.println("검색된 도서가 없습니다.");
		}else{
			if(!result.equals(null)) {
				for (int i = 0; i < result.length; i++) {
					System.out.printf("%d. %s \n", i+1, result[i].inform());
				}
			}
		}
	}
}
