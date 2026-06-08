package chapter07.practice02;

public class Product {
	private String productName;
	private int price;
	private String brand;

	public Product(){
		productName = null;
		price = 0;
		brand = null;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void information(){
		System.out.printf("%s\t/\t%d\t/\t%s\n",productName,price,brand);
	}
}
