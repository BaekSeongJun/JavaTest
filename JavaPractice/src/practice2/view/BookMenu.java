package practice2.view;

import practice2.controller.BookController;
import practice2.model.Book;
import practice2.run.Run;

public class BookMenu {
	private BookController bc;
	public BookMenu(){
		bc = new BookController();
	}

	public void bookInfoDisplay(){
		boolean flag = false;
		while(!flag) {
			System.out.println("1.책 정보 출력 | 2.책 정렬(대여순) | 3.총 대여수 출력 | 4. 대여수와 평균 출력 | 5. HOME ");
			System.out.print("번호 입력 : ");
			int no = 0;
			try {
				no = Integer.parseInt(Run.sc.nextLine());
			} catch (Exception e) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요");
				continue;
			}
			switch (no) {
				case 1:
					printBooks();
					break;
				case 2:
					printSortedBooks();
					break;
				case 3:
					getRentSum();
					break;
				case 4:
					getRentSumAvg();
					break;
				case 5:
					System.out.println("Home으로 돌아갑니다.");
					flag = true;
					break;
				default:
					System.out.println("잘못된 입력입니다. 다시 입력해주세요");
					break;
			}
		}
	}

	//첫번째 책 정보를 다보여주세요. 요청하는 화면
	public void printBooks(){
		System.out.println("========== 도서 정보 출력 ==========");
		Book[] books = bc.printBook();
		for(Book book : books){
			System.out.println(book.inform());
		}
	}
	//두번째 책 정보를 대여순으로 정렬해서 보여주세요.
	private void printSortedBooks(){
		System.out.println("========== 도서 정보 정렬 ==========");
		Book[] books = bc.sortByRentCountDesc();
		for (Book book : books) {
			System.out.println(book.inform());
		}
	}
	//세번째 책 정보에서 총 대여수를 출력해주세요.
	public void getRentSum(){
		System.out.println("========== 총 대여수 출력 ==========");
		System.out.printf("총 대여수 : %d\n", bc.sumRentCount());
	}
	//네번째 책 정보에서 총 대여수와 총대여수의 평균값을 출력해주세요.
	public void getRentSumAvg(){
		System.out.println("========== 대여 통계 출력 ==========");
		double[] sumAvg = bc.avgRentCount();
		System.out.printf("총 대여수 : %d\n 총 대여 평균 : %5.2f\n", (int)sumAvg[0], sumAvg[1]);
	}
}
