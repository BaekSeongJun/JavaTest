package practice2.view;

import practice2.controller.BookController;
import practice2.model.Book;

public class BookMenu {
	private BookController bc;
	public BookMenu(){
		bc = new BookController();
	}

	//첫번째 책 정보를 다보여주세요. 요청하는 화면
	public void printBooks(){
		Book[] books = bc.printBook();
		for(Book b : books){
			System.out.println(b.inform());
		}
	}
	//두번째 책 정보를 대여순으로 정렬해서 보여주세요.

	//세번째 책 정보에서 총 대여수를 출력해주세요.

	//네번째 책 정보에서 총 대여수와 총대여수의 평균값을 출력해주세요.
}
