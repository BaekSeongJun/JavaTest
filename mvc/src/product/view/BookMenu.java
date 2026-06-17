package product.view;

import static product.run.Run.*;

import product.controller.BookController;
import product.model.Book;

public class BookMenu {
	private BookController bc;
	public BookMenu(){
		bc = new BookController();
	}

	public void bookDisplay(){
		boolean flag = false;
		while(!flag){
			System.out.println("==========도서 메뉴입니다==========");
			System.out.println("1.도서 정보 2. 대여 통계 3.도서 등급 4. 도서 정렬 5. 도서 검색 6. 도서 순위 7.HOME");
			System.out.print("메뉴를 선택해주세요 : ");
			int no = Integer.parseInt(sc.nextLine());
			switch(no){
				case 1:
					printBook();
					break;
				case 2:
					avgRentCount();
					break;
				case 3:
					isBest();
					break;
				case 4:
					sortBooks();
					break;
				case 5:
					searchBook();
					break;
				case 6:
					rankBooks();
					break;
				case 7:
					flag = true;
					System.out.println("Home으로 돌아갑니다.");
					break;
				default:
					System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
					break;
				}
			}
		}

	private void printBook() {
		System.out.println("==========도서 정보 출력==========");
		Book[] book = bc.printBook();
		for(Book b : book){
			System.out.println(b.inform());
		}
	}
	private void avgRentCount() {
		System.out.println("==========대여 통계 출력==========");
		double[] avgRent = bc.avgRentCount();
		System.out.printf("도서 대여 총합 : %d\n도서 대여 평균 : %.1f\n",(int)avgRent[0],avgRent[1]);
	}
	private void isBest(){
		System.out.println("==========도서 등급 판별==========");

		Book[] books = bc.printBook();
		for(Book b : books){
			if(b.getRentCount() > BookController.CUT_LINE){
				System.out.printf("%s는 인기 도서(Best Seller)입니다.\n",b.getTitle());
			}else{
				System.out.printf("%s는 일반 도서입니다.\n",b.getTitle());
			}
		}
	}
	private void sortBooks(){
		System.out.println("==========도서 정렬 출력==========");
		Book[] books = bc.sortBooks();
		for(Book b : books){
			System.out.println(b.inform());
		}
	}
	private void searchBook(){
		System.out.println("==========도서 검색 메뉴==========");
		System.out.print("찾으시는 도서명을 입력해주세요 : ");
		Book[] result = bc.searchBook(sc.nextLine());
		if(result.length == 0){
			System.out.println("찾으시는 도서가 없습니다");
		}else {
			for (Book b : result) {
				System.out.println(b.inform());
			}
		}
	}
	private void rankBooks(){
		System.out.println("==========도서 대여 순위==========");
		Book[] books = bc.rankBooks();
		for(Book b : books){
			System.out.printf("%d등 : %s , 대여 횟수 : %s\n", b.getRank(), b.getTitle(), b.getRentCount());
		}
	}

}


