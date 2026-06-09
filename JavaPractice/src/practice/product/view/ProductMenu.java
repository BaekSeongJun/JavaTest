package practice.product.view;

import practice.product.controller.ProductController;
import practice.product.model.vo.Product;

public class ProductMenu {
	private ProductController productController;

	public ProductMenu(){
		productController = new ProductController();
		System.out.println("===== [1] 전체 장바구니 상품 목록 =====");
		Product[] pArr = productController.getProductList();
		for (Product p : pArr) {
			System.out.println(p.inform());
		}
		System.out.println();

		System.out.println("====== [2] 특정 카테고리 상품 수 ======");
		String category = "전자제품";
		System.out.printf("장바구니 내 [%s] 상품 종류 : %d개\n",category, productController.countCategory(category));
		System.out.println();

		System.out.println("====== [3] 가격이 높은 순으로 정렬 ======");
		Product[] sortedArr = productController.getSortedByPriceDesc();
		for (int i = 0; i < sortedArr.length; i++) {
			System.out.printf("%d등 : %s (%d원)\n",i+1,sortedArr[i].getProductName(),sortedArr[i].getPrice());
		}
		System.out.println();

		System.out.println("====== [4] 이번 주문으로 적립될 총 포인트 ======");
		System.out.printf("이번 주문으로 적립될 총 포인트는 [%d원] 입니다.\n",productController.calculateTotalPoints());
	}
}
