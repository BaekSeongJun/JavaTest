package product.controller;

import product.model.Book;

public class BookController {
	private Book[] books;
	private Book[] cbooks;
	public static final int CUT_LINE = 30;
	private static final int BOOK_MAX = 10;

	public BookController(){
		books = new Book[BOOK_MAX];
		books[0] = new Book("자바의 정석", "IT", 45);
		books[1] = new Book("혼공 C언어", "IT", 15);
		books[2] = new Book("피프티 피플", "소설", 50);
		books[3] = new Book("꿈 백화점", "소설", 35);
		books[4] = new Book("삼국지", "역사", 10);
		books[5] = new Book("자바프로그래밍", "IT", 30);
		books[6] = new Book("무인도에서 살아남기", "만화", 20);
		books[7] = new Book("포켓몬스터", "만화", 10);
		books[8] = new Book("자바스크립트", "IT", 50);
		books[9] = new Book("나의 복덕방", "소설", 40);
	}

	public Book[] printBook(){
		return books;
	}

	public int sumRentCount(){
		int sum = 0;
		for(Book book : books){
			sum += book.getRentCount();
		}
		return sum;
	}

	public double[] avgRentCount(){
		double[] avgRent = new double[2];
		avgRent[0] = sumRentCount();
		avgRent[1] = avgRent[0]/BOOK_MAX;
		return avgRent;
	}

	public Book[] sortBooks(){
		cbooks = new Book[BOOK_MAX];
		for(int i = 0; i < BOOK_MAX; i++){
			if(books[i] != null){
				cbooks[i] = new Book(books[i]);
			}
		}
		for(int i = 0; i < cbooks.length - 1; i++){
			for(int j = 0; j < cbooks.length - 1 - i; j++){
				if(cbooks[j].getRentCount() < cbooks[j+1].getRentCount()){
					Book temp = cbooks[j];
					cbooks[j] = cbooks[j+1];
					cbooks[j+1] = temp;
				}
			}
		}
		return cbooks;
	}

	public Book[] searchBook(String bookName){
		Book[] searchBooks = new Book[BOOK_MAX];
		int count = 0;
		for(int i = 0; i < BOOK_MAX; i++){
			if (books[i] != null && books[i].getTitle().contains(bookName)){
				searchBooks[count++] = books[i];
			}
		}
		Book[] results = new Book[count];
		for(int i = 0; i < count; i++){
			results[i] = searchBooks[i];
		}
		return results;
	}

	private void setOriginRank(){
		for(int i = 0; i < BOOK_MAX; i++){
			for(int j = 0; j < BOOK_MAX; j++){
				if(books[i].equals(cbooks[j])){
					books[i].setRank(cbooks[j].getRank());
					break;
				}
			}
		}
	}

	public Book[] rankBooks() {
		if (cbooks == null) {
			sortBooks();
		}
		int count = 1;
		for(int i = 0; i < cbooks.length; i++){
			if(i != 0 && cbooks[i-1].getRentCount() == cbooks[i].getRentCount()){
				cbooks[i].setRank(cbooks[i-1].getRank());
			}else{
				cbooks[i].setRank(count++);
			}
		}
		setOriginRank();
		return cbooks;
	}

}
