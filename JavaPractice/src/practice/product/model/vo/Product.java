package practice.product.model.vo;

public class Product {
	private String productName;
	private String category;
	private int price;
	private int quantity;

	public Product(){
		this(null, null, 0, 0);
	}

	public Product(String productName, String category, int price, int quantity) {
		this.productName = productName;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
	}

	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String inform(){
		return "상품명 : " + productName + " / 카테고리 : " + category + " / 가격 : " + price + " / 수량 : " + quantity;
	}
}
