package chapter07.practice;

public class Product {
	private String productName;
	private int price;
	private String brand;

	public String getProductName() {
		return productName;
	}
	public int getPrice() {
		return price;
	}
	public String getBrand() {
		return brand;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void information(){
		System.out.printf("%s    /    %d    /    %s\n", productName, price, brand);
	}
}
