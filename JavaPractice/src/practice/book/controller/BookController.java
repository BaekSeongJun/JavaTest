package practice.book.controller;

import practice.book.model.vo.Book;

public class BookController {
	private Book[] bArr;
	public static final int CUT_LINE = 30;
	public BookController(){
		bArr = new Book[5];
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

	public double[] avgRentCount(){

		return new double[]{sumRentCount(), (double)sumRentCount() /bArr.length};
	}
}
