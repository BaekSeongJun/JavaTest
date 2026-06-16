package book.controller;

import java.util.Arrays;

import book.model.Book;

public class BookController {
	Book[] bArr = new Book[5];
	public static final int CUT_LINE = 30;

	public BookController(){
		bArr[0] = new Book("자바의정석", "IT", 45);
		bArr[1] = new Book("자바와 C언어", "IT", 15);
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
		double[] avgRentCount = new double[2];
		avgRentCount[0] = sumRentCount();
		avgRentCount[1] = avgRentCount[0]/bArr.length;
		return avgRentCount;
	}

	public Book[] sortByRentCountDesc(){
		Book[] sortedBooks = Arrays.stream(bArr).map(Book::new).toArray(Book[]::new);
		// for(int i = 0; i < 5; i++){
		// 	sortedBooks[i] = bArr[i];
		//
		// }

		for(int i = 0; i < sortedBooks.length - 1; i++){
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

	public Book[] searchBook(String title){
		Book[] result = new Book[bArr.length];
		int count = 0;
		for(int i = 0; i < bArr.length; i++){
			if(bArr[i].getTitle().contains(title)){
				result[count++] = bArr[i];
			}
		}
		Book[] searchedBooks = new Book[count];
		for(int i = 0 ; i < searchedBooks.length; i++){
			searchedBooks[i] = result[i];
		}
		return searchedBooks;
	}
}
