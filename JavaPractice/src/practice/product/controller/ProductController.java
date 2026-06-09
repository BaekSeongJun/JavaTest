package practice.product.controller;

import practice.product.model.vo.Product;

public class ProductController {
	private Product[] pArr;

	public ProductController(){
		pArr = new Product[5];
		pArr[0] = new Product("기계식키보드", "전자제품", 120000, 1);
		pArr[1] = new Product("유기농샐러드", "식품", 12000, 3);
		pArr[2] = new Product("모니터받침대", "가구", 25000, 2);
		pArr[3] = new Product("게이밍마우스", "전자제품", 75000, 1);
		pArr[4] = new Product("가습기", "전자제품", 45000, 2);
	}

	public Product[] getProductList(){
		return pArr;
	}

	//배열에서 특정 카테고리를 가진 물품 수를 return하는 메서드
	public int countCategory(String category){
		int count = 0;
		for (Product product : pArr) {
			if (product.getCategory().equals(category)) {
				count++;
			}
		}
		return count;
	}

	//배열을 정렬해서 return하는 메서드
	public Product[] getSortedByPriceDesc() {
		Product[] sortedArr = new Product[pArr.length];
		for (int i = 0; i < pArr.length; i++) {
			sortedArr[i] = pArr[i];
		}
		for (int i = 0; i < sortedArr.length - 1; i++) {
			for (int j = 0; j < sortedArr.length - 1 - i; j++) {
				if (sortedArr[j].getPrice() < sortedArr[j + 1].getPrice()) {
					Product temp = sortedArr[j];
					sortedArr[j] = sortedArr[j + 1];
					sortedArr[j + 1] = temp;
				}
			}
		}
		return sortedArr;
	}

	//point를 계산해서 return하는 메서드(전자제품은 1%의 포인트 그 외에는 5%)
	public int calculateTotalPoints(){
		int sum = 0;
		for (Product product : pArr) {
			if(product.getCategory().equals("전자제품")){
				sum += (int)((product.getPrice() * product.getQuantity()) * 0.01);
			}else{
				sum += (int)((product.getPrice() * product.getQuantity()) * 0.05);
			}
		}
		return sum;
	}
}
