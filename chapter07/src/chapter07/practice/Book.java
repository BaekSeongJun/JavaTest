package chapter07.practice;

public class Book {
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;

	public Book(){
		this(null, null, null, 0, 0.0);
	}
	public Book(String title, String publisher, String author){
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = 0;
		this.discountRate = 0.0;
	}

	public Book(String title, String publisher, String author, int price, double discountRate) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}

	public String getTitle() {
		return title;
	}
	public String getPublisher() {
		return publisher;
	}
	public String getAuthor() {
		return author;
	}
	public int getPrice() {
		return price;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	public void inform() {
		System.out.printf("도서명:  %s  저자명:  %s  출판사:  %s  가격:  %d  할인율 : %.2f\n",title,author,publisher,price,discountRate);
	}
}
