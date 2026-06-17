package product.model;

import java.util.Objects;

public class Book {
	private String title;
	private String genre;
	private int rentCount;
	private int rank;

	public Book(){
		this(null,null,0);
	}

	public Book(String title, String genre, int rentCount) {
		this.title = title;
		this.genre = genre;
		this.rentCount = rentCount;
		rank = 0;
	}

	public Book(Book book){
		this.title = book.title;
		this.genre = book.genre;
		this.rentCount = book.rentCount;
		this.rank = book.rank;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getRentCount() {
		return rentCount;
	}
	public void setRentCount(int rentCount) {
		this.rentCount = rentCount;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Book book))
			return false;
		return Objects.equals(getTitle(), book.getTitle()) && Objects.equals(getGenre(),
			book.getGenre());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getTitle(), getGenre());
	}

	public String inform(){
		return "도서명 : " + title + " / 장르 : " + genre + " / 대여 횟수 : " + rentCount;
	}
}
