package practice.book.view;

import practice.book.controller.BookController;
import practice.book.model.vo.Book;

public class BookMenu {
	BookController bcm;
	public BookMenu(){
		bcm = new BookController();
		System.out.println("========== 도서 정보 출력 ==========");
		// 1. BookController의 printBook() 반환값을 활용해 모든 도서 정보 출력 (inform() 사용)
		Book[] books = bcm.printBook();
		for(Book book : books){
			System.out.println(book.inform());
		}
		System.out.println("========== 대여 통계 출력 ==========");
		// 2. BookController의 avgScore()와 유사한 avgRentCount()를 호출하여 대여 총합과 평균 출력
		double[] sumAvg = bcm.avgRentCount();
		System.out.printf("전체 도서 대여횟수 합계 : %d\n 전체 도서 대여 횟수 평균 : %.1f\n",(int)sumAvg[0],sumAvg[1]);
		System.out.println("========== 도서 등급 판별 ==========");
		// 3. 도서의 대여 횟수가 CUT_LINE(30회) 미만이면 "일반 도서", 이상이면 "인기 도서(Best Seller)"로 판별하여 출력
		for(Book book : books){
			if(book.getRentCount() < BookController.CUT_LINE ){
				System.out.printf("%s 도서는 일반 도서입니다.\n",book.getTitle());
			}else{
				System.out.printf("%s 도서는 인기 도서(Best Seller)입니다.\n",book.getTitle());
			}
		}
		System.out.println("========== 도서 정보 정렬 ==========");
		Book[] sortedBook = bcm.getSortedBookByRentDesc();
		for(Book book : sortedBook){
			System.out.println(book.inform());
		}
	}
}
