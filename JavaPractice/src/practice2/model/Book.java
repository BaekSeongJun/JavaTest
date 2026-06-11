package practice2.model;

import java.util.Objects;

public class Book implements AutoCloseable{
	private String title;
	private String genre;
	private int rentCount;

	public Book(){
		this(null,null,0);
	}

	public Book(String title, String genre, int rentCount) {
		this.title = title;
		this.genre = genre;
		this.rentCount = rentCount;
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

	public String inform(){
		return "도서명 : " + title + " / 장르 : " + genre + " / 대여 횟수 : " + rentCount;
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

	@Override
	public String toString() {
		return "Book{" +
			"title='" + title + '\'' +
			", genre='" + genre + '\'' +
			", rentCount=" + rentCount +
			'}';
	}

	@Override
	public void close() throws Exception {
	}
}
