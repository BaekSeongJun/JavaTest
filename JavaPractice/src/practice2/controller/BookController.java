package practice2.controller;

import practice2.model.Book;

//업무처리기능(사용자요청을 받고 => 데이터베이스에 해당자료를 요청 => 사용자요청자료에 맞게 조작.(비지니스 로직) => 화면에 제공한다.
public class BookController {
	private Book[] bArr;
	public static final int CUT_LINE;
	public static final int BOOK_COUNT;
	static{
		CUT_LINE = 30;
		BOOK_COUNT = 5;
	}

	public BookController() {
		bArr = new Book[BOOK_COUNT];
		bArr[0] = new Book("자바의 정석", "IT", 45);
		bArr[1] = new Book("혼공 C언어", "IT", 15);
		bArr[2] = new Book("피프티 피플", "소설", 50);
		bArr[3] = new Book("꿈 백화점", "소설", 35);
		bArr[4] = new Book("삼국지", "역사", 10);
	}

	public Book[] printBook(){
		return bArr;
	}

	public int sumRentCount(){
		int sum = 0;
		for(Book book : bArr){
			sum += book.getRentCount();
		}
		return sum;
	}

	//[0]합계 [1]평균
	public double[] avgRentCount(){
		double[] avgRentCount = new double[2];
		avgRentCount[0] = sumRentCount();
		avgRentCount[1] = avgRentCount[0] / BOOK_COUNT;
		return  avgRentCount;
	}

	//정렬
	public Book[] sortByRentCountDesc(){
		Book[] sortedBooks = new Book[BOOK_COUNT];
		for(int i = 0; i < BOOK_COUNT; i++){
			sortedBooks[i] = bArr[i];
		}
		for(int i = 0; i < sortedBooks.length-1; i++){
			for(int j = 0; j < sortedBooks.length - 1 - i; j++){
				if(sortedBooks[j].getRentCount() < sortedBooks[j+1].getRentCount()){
					Book temp = sortedBooks[j];
					sortedBooks[j] = sortedBooks[j+1];
					sortedBooks[j+1] = temp;
				}
			}
		}
		return sortedBooks;
	}
}
